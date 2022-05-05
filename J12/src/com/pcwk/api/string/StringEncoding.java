package com.pcwk.api.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.apache.log4j.*;

public class StringEncoding {
    final static Logger  LOG = Logger.getLogger(StringEncoding.class);    
	public static void main(String[] args) {
		String str = "가";
		
		try {
			byte[] bArr = str.getBytes("UTF-8");//encoding
			byte[] bArrMS = str.getBytes("CP949");//MS949
			
			//한글 : 3byte
			LOG.debug("UTF-8  bArr:"+Arrays.toString(bArr));//UTF-8  bArr:[-22, -80, -128]
			LOG.debug("UTF-8: "+new String(bArr,"UTF-8") );//decoding
			
			//한글 : 2byte
			LOG.debug("CP949 bArrMS:"+Arrays.toString(bArrMS));//CP949 bArrMS:[-80, -95]
			LOG.debug("CP949: "+new String(bArrMS,"CP949"));
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}
}
