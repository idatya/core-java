package com.sh.java6;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("hi");
        System.out.println(new Date());
        System.out.println("hello \n" + Calendar.getInstance().getTime());
        String age;
        String Age;
        
        String str = ",15,52,";
		System.out.println(str.replaceAll("^,", ""));
		System.out.println(str.replaceAll("^,", "").replaceAll(",$", ""));
        
        /*System.out.println(CoreEncryptUtils.decrypt("t3aetgP/6rx4xBVd850UaA=="));
        System.out.println(CoreEncryptUtils.decrypt("3Otfh9nmJr/sQEP+r+Kk5A=="));
        System.out.println(CoreEncryptUtils.decrypt("JJptsbk66HPluSEd4Jy/phvhh+JW3YPSCuSS3/vydeU="));

        System.out.println("Test "
                + DateUtils.parseDate(CoreEncryptUtils.decrypt("JJptsbk66HPluSEd4Jy/phvhh+JW3YPSCuSS3/vydeU=")));
        */
        List list = new ArrayList();
        System.out.println(list.isEmpty());
        
        
		 System.out.println(generateTransactionId());
		 System.out.println(InetAddress.getLocalHost());
        
		 System.out.println(Math.sqrt(9.));
    }

	public static String generateTransactionId() throws Exception {

		try {

			String strRetVal = "";
			String strTemp = "";

			InetAddress addr = InetAddress.getLocalHost();
			byte[] ipaddr = addr.getAddress();
			for (int i = 0; i < ipaddr.length; i++) {
				Byte b = new Byte(ipaddr[i]);
				System.out.println( "ipaddr["+i+"] = "+ipaddr[i] );
				strTemp = Integer.toHexString(b.intValue() & 0x000000ff);
				while (strTemp.length() < 2) {
					strTemp = '0' + strTemp;
				}
				strRetVal += strTemp;
			}

			strRetVal += "-" + System.currentTimeMillis() + "-"
					+ (int) (Math.random() * 1000);
			return strRetVal;
		} catch (Exception e) {
			System.out
					.println("Exception occurred while Generating TransactionId. Reason :[ "
							+ e.getMessage() + " ]");
			throw e;
		}

	}

}
