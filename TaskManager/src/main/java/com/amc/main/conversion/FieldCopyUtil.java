package com.amc.main.conversion;

import java.lang.reflect.Field;

public class FieldCopyUtil {
	  public static void setFields(Object from, Object to) {
	        Field[] fields = from.getClass().getDeclaredFields();
	        for (Field field : fields) {
	            try {
	                Field fieldFrom = from.getClass().getDeclaredField(field.getName());
	                Object value = fieldFrom.get(from);
	                to.getClass().getDeclaredField(field.getName()).set(to, value);
	 
	            } catch (IllegalAccessException e) {
	                e.printStackTrace();
	            } catch (NoSuchFieldException e) {
	                e.printStackTrace();
	            }
	        }
	        
	        
	       JobTo j2 = (JobTo)to;
	       System.out.println(j2.getJobName());
	       System.out.println(j2.getJobDescription());
	    }

}
