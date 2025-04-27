package com.interview.capgamini052024;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		System.out.println(100 + 100 +"Test");
				//200 test 
		//System.out.println("CapGemnini Itnerview" + 100 + 100);  
		// CapGemini Interview 100 100
		          
		       /* try{
                    int i= 10/0;
			        }catch(Exception e) {
				
			        }
                   catch(NullPointerException e) {}
                   */
			/*try {
				int i = 10/0;
			} catch (Exception e) {
				// TODO: handle exception
			}
			catch(NullPointerException n) {}
			*/
		List<String> list = Arrays.asList("Jon", "Ajeet", "Steve","Ajeet", "Jon", "Ajeet");
		Set<String> st = new HashSet<String>(list);
        for (String str : st)
            System.out.println(str + ": " + Collections.frequency(list, str));
	}

}
