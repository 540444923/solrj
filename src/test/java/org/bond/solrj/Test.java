package org.bond.solrj;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.println("---开始处理---");
			String url = "http://127.0.0.1:8989/solr/book";
			IndexFile dd = new IndexFile(url);

			boolean flag = dd.index(new File("D:\\123456.txt"));

			System.out.print("---結束处理---");
			System.out.println(flag);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}