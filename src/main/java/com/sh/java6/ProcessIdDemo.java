package com.sh.java6;

import java.io.IOException;

public class ProcessIdDemo {

	public static void main(String[] args) throws IOException {
		byte[] bo = new byte[100];
		String[] cmd = { "bash", "-c", "echo $PPID" };
		Process p = Runtime.getRuntime().exec(cmd);
		p.getInputStream().read(bo);
		System.out.println(new String(bo));

	}

}
