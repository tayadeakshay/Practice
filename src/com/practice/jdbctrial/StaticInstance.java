package com.practice.jdbctrial;
import java.sql.*;

public class StaticInstance {

	
	public static void main(String[] args) throws Exception{
	
//System.out.println("Inside Main Method");

//Block sI = new Block();
Class.forName("Block");
	}

}

class Block
{
	static
	{
		System.out.println("Inside static block");
	}
	
	{
		System.out.println("Inside Instance block");
	}	
}
