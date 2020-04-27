public class Printer {
    private int paper;

    public Printer(int paper){
        this.paper = paper;
    }

    public int getPaper(){
        return paper;
    }

    public int print(int pages, int copies) {
      return paper -= (pages * copies);
    };
}
