public class Books {
    String title;
    String author;
    String numberofpages;
    String publisher;
    public void display()
    {
        System.out.println("Bartimaeus :" +title);
        System.out.println("Author : "+author);
        System.out.println("Number of pages : "+numberofpages);
        System.out.println("Publisher : "+publisher);
    }
    public void setTitle( String stitle){
        title = stitle;
    }
    public void setauthor( String sauthor){
        author = sauthor;
    }
    public void setnumberofpages( String snumberofpages){
        numberofpages = snumberofpages;
    }
    public void setpublisher( String spublisher){
        publisher = spublisher;
    }
    public static void main ( String args[]){
        Books B1 = new Books();
        B1.setTitle("The Ring of Solomon");
        B1.setauthor("Jonathan Stroud");
        B1.setnumberofpages("448 ");
        B1.setpublisher(" Doubleday");
        B1.display();
    }

}
