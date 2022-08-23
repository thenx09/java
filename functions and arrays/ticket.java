char y,n,k,q ;
        int ticket = sc.nextInt();
        char refreshments = sc.next().charAt(0);
        char couponcode = sc.next().charAt(0);
        char clas = sc.next().charAt(0);
        
        /*int cost = (ticket*150);
        double bulkdiscount = cost-(0.1*cost);
        double couponcode = ticket-(ticket*0.02);
        int refreshments = (50*ticket);
        double totalcost = (cost-bulkdiscount+refreshments);*/
        
       if(ticket>20)
       {
           if(clas==q){
               int cost = (ticket*150);
               double bulkdiscount = cost-(0.1*cost);
               int refreshment = (50*ticket);
               double totalcost = (cost-bulkdiscount+refreshment);
               System.out.println(totalcost);}
           else{
               int cost = (ticket*75);
               double bulkdiscount = cost-(0.1*cost);
               int refreshment = (50*ticket);
               double totalcost = (cost-bulkdiscount+refreshment);
               System.out.println(totalcost);}

       }
        else if(ticket<20)
        {
            if(clas==q){
                int cost = (ticket*150);
                double couponcodes = ticket-(ticket*0.02);
                int refreshment = (50*ticket);
                double totalcost = (cost-couponcodes+refreshment);
                System.out.println(totalcost);}
            else{
                int cost = (ticket*75);
                double couponcodes = ticket-(ticket*0.02);
                int refreshment = (50*ticket);
                double totalcost = (cost-couponcodes+refreshment);
                System.out.println(totalcost);}
            
                
        }
