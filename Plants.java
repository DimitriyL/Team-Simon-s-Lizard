public class Plants extends Character{

    protected String bullet;
    protected int cost;
    protected int freq;

    public Plants(String bullet1, int freq1, int xCor1, int yCor1){
	bullet = bullet1;
	freq = freq1;
	super.xCor = xCor1;
	super.yCor = yCor1;
    }

    public String shoot () {
	return bullet;
    } 
}
