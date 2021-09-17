package com.training.assign2a;

import java.util.ArrayList;
import java.util.List;


public class Outofmemory {
static List<String> list = new ArrayList<String>();
	    
	    public static void main(String[] args) {
	        {
	            try 
	            {
	                int[] arr = new int[1000 * 10000 * 1000];
	            }
	            catch(OutOfMemoryError ome) 
	            {
	                System.out.println("Array size - "+ome);
	            }
	        }
	    }
	}
	