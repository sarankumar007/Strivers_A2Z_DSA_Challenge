class Solution 
{
    
    public static int maxMeetings(int start[], int end[], int n)
    {
        int count=1;
        List<Meeting> list=new ArrayList<>();
        Comparator<Meeting> com=new Comparator<>(){
          public  int compare(Meeting i, Meeting j){
              if(i.end>j.end)
              return 1;
              else if(i.end<j.end)
              return -1;
              else if(i.pos<j.pos)
              return -1;
              else
              return 1;
          }  
            
        };
        
        for(int i=0;i<start.length;i++){
            list.add(new Meeting(start[i],end[i],i+1));//incase  index is asked
        }
        Collections.sort(list,com);
        int limit=list.get(0).end;
        for(int  i=1;i<list.size();i++){
            if(list.get(i).start>limit){
                count++;
                limit=list.get(i).end;
            }
        }
        return  count;
    }
}

class Meeting{
    int start,end,pos;
    Meeting(int start,int end, int pos){
        this.start=start;
        this.end=end;
        this.pos=pos;
    }
}
