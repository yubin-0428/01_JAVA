package com.pcwk.library.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.pcwk.cmn.DTO;
import com.pcwk.cmn.DataStore;
import com.pcwk.cmn.LoggerManager;
import com.pcwk.cmn.WorkDiv;
import com.pcwk.library.domain.Book;

public class BookDao implements WorkDiv<Book>, LoggerManager {
	//저장 파일에서 읽어 들인 Data : CRUD,마지막에 파일에 기록
	
	public static List<Book>  bookList=new ArrayList<>();
	//저장 파일 경로
	public final static String SAVE_FILE_PATH = "C:\\DCOM_20220127\\01_JAVA\\workspace\\PCWK_BookMng\\src\\com\\pcwk\\data\\books.csv";
	
	public BookDao() {
		int readStatus = readFile(SAVE_FILE_PATH);
		if(0==readStatus) {
			LOG.debug("파일 읽기 실패");
		}else {
			LOG.debug("파일 읽기 성공");
		}
		
	}
	
	/**
	 * ArrayList에 있는 내용을 SAVE_FILE_PATH에 기록
	 * @param filePath
	 * @return 저장 건수 return 
	 */
	public int saveFile(String filePath) {
		int writeCnt = 0;
		//FileWriter fw=new FileWriter(filePath);
		
		
		//try-with-resource		
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(filePath))) {
			
			//arrayList -> file기록
			for(Book book   :bookList) {
				//1163032212-9791163032212,Do it! HTML+CSS+<b>자바</b>스크립트 웹 표준의 정석,고경희,IT,1
				String del =",";
				
				//대여가능 여부
				int available = book.isAvailable()?1:0;
				
				
				String outData = book.getIsbn()+del+
						         book.getTitle()+del+
						         book.getAuthor()+del+
						         book.getGenre()+del+
						         available+"\n";
				bw.write(outData);	
				
				writeCnt++;
			}
			
			
		}catch(IOException e) {
			LOG.debug("============================");
			LOG.debug("=IOException="+e.getMessage());
			LOG.debug("============================");
		}
		
		
		
		return writeCnt;
	}
	
	
	
	/**
	 * books.csv를 읽어서 bookList할당
	 * @param filePath
	 * @return 0(실패)/1(성공)
	 */
	public int readFile(String filePath){
		int flag = 0;
		//try-with-resource
		try(BufferedReader br =new BufferedReader(new FileReader(filePath))) {
			String line = "";
			
			//8994492046-9788994492049,Java의 정석 기초편,남궁성,IT,1  => Book
			int i = 0;
			while( (line = br.readLine()) !=null  ) {

				String[] inArray = line.split(",");
				
				//public Book(String isbn, String title, String author, String genre, boolean available) {
				//대여가능 여부
				//1 -> true
				//0 -> false
				boolean available = ( inArray[4].equals("1")?true:false );
				
				Book book=new Book(inArray[0], inArray[1], inArray[2], inArray[3], available);
				bookList.add(book);
			}
			
			if(bookList.size()>0)flag++;			
			
		}catch(IOException e) {
			LOG.debug("===============================");
			LOG.debug("=IOException="+e.getMessage());
			LOG.debug("===============================");
		}
		
		
		return flag;
	}
	
	
	
	
	@Override
	public List<Book> doRetrieve(DTO dto) {
		
		return bookList;
	}

	
    /**
     * Book이 존재하는지 확인
     * @param dto
     * @return 1(존재)/0(없음)
     */
	public int isBookExists(Book dto) {
		int flag = 0;
		
		for(Book book  :bookList) {
			if(book.getIsbn().equals(dto.getIsbn())) {
				flag = 1;
				break;
			}
		}
		
		return flag;
	}
	
	
	@Override
	public int doSave(Book dto) {
		if(1==isBookExists(dto)) {
			System.out.println("도선 번호가 존재 합니다.\n중복도서 번호 "+dto.getIsbn());
			return -1;
		}
		
		boolean flag = bookList.add(dto);
		
		return (flag==true)?1:0;
	}

	@Override
	public int doDelete(Book dto) {
		int flag = 0;
		//삭제 하기: 
		for(int i = bookList.size()-1;i>=0;i--) {
			Book book = bookList.get(i);
			//도서번호로 비교
			if(book.getIsbn().equals(dto.getIsbn())) {
				bookList.remove(i);
				flag=1;
				break;
			}
		}
		
		return flag;
	}

	@Override
	public Book doSelectOne(Book dto) {
		Book outData = null;
		
		for(Book book  :bookList) {
			if(book.getIsbn().equals(dto.getIsbn())) {
				outData = book;
				break;
			}
		}
		
		return outData;
	}

	@Override
	public int doUpdate(Book dto) {
		int flag = 0;
		//1.수정 데이터가 있는지 확인
		//2.기존삭데
		//3.수정 데이터 등록
		
		flag += doDelete(dto);
		flag +=	doSave(dto);
		
		
		return flag;
	}




}
