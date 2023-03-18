package ArraysPack;

public class SimpleStartup {
    public static void main(String[] abs){
        SimpleStartupTest sst = new SimpleStartupTest();

        int[] locationCells = {1,2,3};
        sst.setLocation(locationCells);
        String result = sst.checkYourSelf(2);
        String testResult = "Failed";
        if (testResult.equals(result)){
            testResult = "Passed";
        }
        System.out.println(testResult);
    }
}

class SimpleStartupTest{
    int[] locationCells;
    int numOfHits;

    String checkYourSelf(int guess){
        String retObj = "";
        for(int i=0; i<=locationCells.length; i++){
            if (guess == locationCells[i]) {
                numOfHits++;

                if (numOfHits == 3) {
                    retObj = "Kill";
                } else {
                    retObj = "Hit";
                }
            }else {
                retObj = "Miss";
            }
        }
            return retObj;
    }

    void setLocation(int[] loc){
        for (int i=0; i<= loc.length; i++){
            locationCells[i] = loc[i];
        }
    }
}