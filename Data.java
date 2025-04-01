public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
	   public static double average(Measurable[] objects) 
	   {
	      double sum = 0;
	      int count = 0;
	      
	      
	      for (Measurable obj : objects)
	      {
		      if (obj instanceof BankAccount) 			
		      {
		    	  if (((BankAccount) obj).Accept(1000.00)) // checks balance with filter
				  {
		    		  sum = sum + obj.getMeasure();
		    		  count++;
		    	  }    
		      }
		      else // no filter
	    	  {
	    		  sum = sum + obj.getMeasure();
	    		  count++;
	    	  }
	      }
	      
	      if (count > 0) 
	      { 
	    	  return sum / count; 		 
	      } 
	      else { return 0; }			 
	   }		
	}



        
    



