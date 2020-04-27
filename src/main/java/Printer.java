public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper(){
        return paper;
    }

    public int getToner() {
        return toner;
    }

    public int print(int pages, int copies) {

      int printRequest = (pages * copies);

        if (paper < printRequest) {
            System.out.println("not enough paper");
        } else {
            paper -= printRequest;
            toner -= printRequest;
        } return paper;
    };
}
