package Tea

object Harvest {
  

    def main(args: Array[String])
    {
      
        
      
        //Assigning the values
         
        var arr = Array(Array(0, 2, 4, 6, 8, 1, 1),
                    Array(1, 3, 5, 7, 9, 2, 2),Array(1, 2, 3, 4, 5, 6, 7),Array(2, 4, 6, 8, 1, 12, 14))
        //finding maximum harvest
        var max=arr(0)(0)
  
        for(i<-0 to 3)
        {
            for(j<- 0 to 6)
            {
                
                if(arr(i)(j)>=max){
                    max=arr(i)(j)
                  
                }
                
            }
            
        }
        println("The maximum harvest is : "+max+"kg")
        
        //finding minimum harvest
        var min=arr(0)(0)
  
        for(i<-0 to 3)
        {
            for(j<- 0 to 6)
            {
                
                if(arr(i)(j)<=min){
                    min=arr(i)(j)
                  
                }
                
            }
            
        }
        println("The minimum harvest is : "+min+"kg") 
        
        //finding total harvest during the month
        var sum=0
        for(i<-0 to 3){
          for(j<-0 to 6){
              sum=sum+arr(i)(j)
            
          }
        }
        println("The total harvest is : "+sum+"kg") 
        
        //finding average harvest in a day
        var avg=sum/28
        println("The average harvest is ; "+avg+"kg") 
        //println("The range is "+min "to" +max)
        
      
        
        
    }

}