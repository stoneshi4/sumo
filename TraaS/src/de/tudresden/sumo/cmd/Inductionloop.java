/*   
    Copyright (C) 2014 Mario Krumnow, Dresden University of Technology

    This file is part of TraaS.

    TraaS is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License.

    TraaS is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with TraaS.  If not, see <http://www.gnu.org/licenses/>.
*/

package de.tudresden.sumo.cmd;
import de.tudresden.sumo.config.Constants;
import de.tudresden.sumo.util.SumoCommand;
import de.tudresden.ws.container.SumoStringList;

/**
 * 
 * @author Mario Krumnow
 * @author Evamarie Wiessner
 *
 */

public class Inductionloop {

	//getter methods

	/**
	 * Returns a list of IDs of all induction loops within the scenario.
	 * 
	 * @return list of IDs of all induction loops in the network
	 */

	public static SumoCommand getIDList(){
		return new SumoCommand(Constants.CMD_GET_INDUCTIONLOOP_VARIABLE, Constants.ID_LIST, "", Constants.RESPONSE_GET_INDUCTIONLOOP_VARIABLE, Constants.TYPE_STRINGLIST);
	}
	
	
	/**
	 * Returns the number of all induction loops in the network.
	 */

	public static SumoCommand getIDCount(){
		return new SumoCommand(Constants.CMD_GET_INDUCTIONLOOP_VARIABLE, Constants.ID_COUNT, "", Constants.RESPONSE_GET_INDUCTIONLOOP_VARIABLE, Constants.TYPE_INTEGER);
	}


	/**
	 * Returns the ID of the lane the loop is placed at.
	 * 
	 * @param loopID
	 *            a string identifying the induction loop
	 * @return a string identifying the lane
	 */

	public static SumoCommand getLaneID(String loopID){
		return new SumoCommand(Constants.CMD_GET_INDUCTIONLOOP_VARIABLE, Constants.VAR_LANE_ID, loopID, Constants.RESPONSE_GET_INDUCTIONLOOP_VARIABLE, Constants.TYPE_STRING);
	}

	/**
	 * Returns the mean length of vehicles (in m) which were on the detector in
	 * the last step.
	 * 
	 * @param loopID
	 *            a string identifying the induction loop
	 * @return average length of the vehicles (in m)
	 */

	public static SumoCommand getLastStepMeanLength(String loopID){
		return new SumoCommand(Constants.CMD_GET_INDUCTIONLOOP_VARIABLE, Constants.LAST_STEP_LENGTH, loopID, Constants.RESPONSE_GET_INDUCTIONLOOP_VARIABLE, Constants.TYPE_DOUBLE);
	}

	/**
	 * Returns the mean speed of vehicles (in m/s) that were on the named
	 * induction loop within the last simulation step.
	 * 
	 * @param loopID
	 *            a string identifying the induction loop
	 * @return average speed of the vehicles (in m/s)
	 */

	public static SumoCommand getLastStepMeanSpeed(String loopID){
		return new SumoCommand(Constants.CMD_GET_INDUCTIONLOOP_VARIABLE, Constants.LAST_STEP_MEAN_SPEED, loopID, Constants.RESPONSE_GET_INDUCTIONLOOP_VARIABLE, Constants.TYPE_DOUBLE);
	}

	/**
	 * Returns the percentage of time (in %) the detector was occupied by a
	 * vehicle within the last time step.
	 * 
	 * @param loopID
	 *            a string identifying the induction loop
	 * @return occupancy of the detector (in %)
	 */

	public static SumoCommand getLastStepOccupancy(String loopID){
		return new SumoCommand(Constants.CMD_GET_INDUCTIONLOOP_VARIABLE, Constants.LAST_STEP_OCCUPANCY, loopID, Constants.RESPONSE_GET_INDUCTIONLOOP_VARIABLE, Constants.TYPE_DOUBLE);
	}

	/**
	 * Returns the list of IDs of vehicles that were on the named induction loop
	 * in the last simulation step.
	 * 
	 * @param loopID
	 *            a string identifying the induction loop
	 * @return list of all vehicleIDs
	 */

	public static SumoCommand getLastStepVehicleIDs(String loopID){
		return new SumoCommand(Constants.CMD_GET_INDUCTIONLOOP_VARIABLE, Constants.LAST_STEP_VEHICLE_ID_LIST, loopID, Constants.RESPONSE_GET_INDUCTIONLOOP_VARIABLE, Constants.TYPE_STRINGLIST);
	}

	/**
	 * Returns the number of vehicles that were on the named induction loop
	 * within the last simulation step.
	 * 
	 * @param loopID
	 *            a string identifying the induction loop
	 * @return total number of vehicles
	 */

	public static SumoCommand getLastStepVehicleNumber(String loopID){
		return new SumoCommand(Constants.CMD_GET_INDUCTIONLOOP_VARIABLE, Constants.LAST_STEP_VEHICLE_NUMBER, loopID, Constants.RESPONSE_GET_INDUCTIONLOOP_VARIABLE, Constants.TYPE_INTEGER);
	}

	/**
	 * Returns the position (in m) of the induction loop at it's lane, counted
	 * from the lane's begin.
	 * 
	 * @param loopID
	 *            a string identifying the induction loop
	 * @return position of the detector, counted from the lane's begin
	 */

	public static SumoCommand getPosition(String loopID){
		return new SumoCommand(Constants.CMD_GET_INDUCTIONLOOP_VARIABLE, Constants.VAR_POSITION, loopID, Constants.RESPONSE_GET_INDUCTIONLOOP_VARIABLE, Constants.TYPE_DOUBLE);
	}

	/**
	 * Return the time (in s) since last detection.
	 * 
	 * @param loopID
	 *            a string identifying the induction loop
	 * @return time since last detection (in s)
	 */

	public static SumoCommand getTimeSinceDetection(String loopID){
		return new SumoCommand(Constants.CMD_GET_INDUCTIONLOOP_VARIABLE, Constants.LAST_STEP_TIME_SINCE_DETECTION, loopID, Constants.RESPONSE_GET_INDUCTIONLOOP_VARIABLE, Constants.TYPE_DOUBLE);
	}

	/**
	 * A complex structure containing several information about vehicles which
	 * passed the detector.
	 * 
	 * @param loopID
	 *            a SumoStringList containing induction loops
	 */

	public static SumoCommand getVehicleData(SumoStringList loopID){
		return new SumoCommand(Constants.CMD_GET_INDUCTIONLOOP_VARIABLE, Constants.LAST_STEP_VEHICLE_DATA, loopID, Constants.RESPONSE_GET_INDUCTIONLOOP_VARIABLE, Constants.TYPE_INTEGER);
	}

	//setter methods


}