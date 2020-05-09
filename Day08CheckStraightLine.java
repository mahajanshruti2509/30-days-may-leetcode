/**
 * Check If It Is a Straight Line
 *
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
 * Check if these points make a straight line in the XY plane.
 *
 * Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
 * Output: true
 *
 * Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
 * Output: false
 *
 * */

class Solution {
  public boolean checkStraightLine(int[][] coordinates) {
    if(coordinates.length == 0) {
      return false;
    }

    double slopeWithSecondPoint = 0;
    double x1 = coordinates[0][0];
    double y1 = coordinates[0][1];

    for(int i = 1; i < coordinates.length; i++) {
      double x2 = coordinates[i][0];
      double y2 = coordinates[i][1];

      if(x2 - x1 == 0) {
        return false;
      }

      if(slopeWithSecondPoint == 0) {
        slopeWithSecondPoint = (y2 -y1) / (x2-x1);
        continue;
      }

      double slopeWithCurrentPoint = (y2 - y1) / (x2-x1);
      if(slopeWithSecondPoint != slopeWithCurrentPoint) {
        return false;
      }
    }
    return true;
  }
}