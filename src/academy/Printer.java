package academy;

public class Printer {
    private int tonnerlevel;
    private int pagesprinted;
    private boolean duplex;

    public Printer(int tonnerlevel, boolean duplex) {
        if(tonnerlevel>0&&tonnerlevel<=100)
        this.tonnerlevel = tonnerlevel;
        else
            tonnerlevel=-1;
        this.duplex = duplex;
    }
    public void tonner(int tonnerammount){
        if(tonnerammount>0&&tonnerammount<=100)
            if(tonnerammount+tonnerlevel>100)
                tonnerlevel=-1;
            else
                tonnerlevel+=tonnerammount;
            else
                tonnerlevel=-1;

    }
    public int pagesprinted(int pages){
        int pagesprinted=pages;
        if(duplex)
            pagesprinted=(pages/2)+pages%2;
         return pagesprinted;
    }

    public int getTonnerlevel() {
        return tonnerlevel;
    }
}

