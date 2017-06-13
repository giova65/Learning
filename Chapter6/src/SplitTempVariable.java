
public class SplitTempVariable {

	private int _mass;
	private int _primaryForce;
	private int _delay;
	private int _secondaryForce;

	double getDistanceTravelled(int time){
		double result;
		double primaryAcc = _primaryForce / _mass;
		int primaryTime = Math.min(time, _delay);
		result = 0.5 * primaryAcc * primaryTime * primaryTime;
		int secondaryTime = time - _delay;
		if(secondaryTime > 0){
			double primaryVel = primaryAcc * _delay;
			double secondaryAcc = (_primaryForce + _secondaryForce) / _mass;
			result += primaryVel * secondaryTime + 0.5 * secondaryAcc * secondaryTime * secondaryTime;
		}
		return result;
	}
}
