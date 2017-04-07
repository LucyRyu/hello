/**
 * Created by danawacomputer on 2017-04-07.
 */
public class changeTempCelToFahService {

    public double changeTempCelToFah (int Cel){
        double FahTemp = 0;
        FahTemp = (int)(Cel*1.8) + 32;
        return FahTemp;
    }
}
