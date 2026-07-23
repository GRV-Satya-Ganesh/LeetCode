class MyCalendar {

    private List<int[]> bookings = new ArrayList<>();

    public MyCalendar() {
        
    }
    
    public boolean book(int startTime, int endTime) {
        if(bookings.isEmpty()){
            this.bookings.add(new int[]{startTime, endTime});
            return true;
        }

        for(int i = 0; i < bookings.size(); i++){
            int listedStart = bookings.get(i)[0];
            int listedEnd = bookings.get(i)[1];

            if(!(endTime <= listedStart || startTime >= listedEnd)){
                return false;
            } 
        }

        this.bookings.add(new int[]{startTime, endTime});

        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */