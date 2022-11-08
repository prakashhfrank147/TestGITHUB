package com.baseclass;

import java.io.IOException;

public class Testing extends BaseClass {
	private void test() throws IOException {
		// TODO Auto-generated method stub
		String dataFromCell = getDataFromCell("Sheet1", 1, 16);
		String Cell = getDataFromCell("Sheet1", 1, 16);
		System.out.println(Cell);
	}

	public static void main(String[] args) throws IOException {
		Testing t = new Testing();
		t.test();
	}
}
