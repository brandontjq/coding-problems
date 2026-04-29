package leetcode;

import java.util.*;

public class AlertUsingSameKeycardMoreThan3Times {

    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < keyName.length; i++) {
            String name = keyName[i];
            int time = convertToMinutes(keyTime[i]);

            if (!map.containsKey(name)) {
                List<Integer> timeList = new ArrayList<>();
                timeList.add(time);
                map.put(name, timeList);
            } else {
                List<Integer> timeList = map.get(name);
                timeList.add(time);
                map.put(name, timeList);
            }
        }
        List<String> result = new ArrayList<>();

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            String name = entry.getKey();
            List<Integer> timeListSorted = entry.getValue();


            if (timeListSorted.size() >= 3) {
                Collections.sort(timeListSorted);
                for (int i = 0; i < timeListSorted.size() - 2; i++) {
                    int firstTime = timeListSorted.get(i);
                    int thirdTime = timeListSorted.get(i + 2);
                    if (thirdTime - firstTime <= 60) {
                        result.add(name);
                        break;
                    }
                }
            }
        }
        Collections.sort(result);
        return result;
    }

    private int convertToMinutes(String keyTime) {
        String[] time = keyTime.split("\\:");
        int hourInMinutes = Integer.parseInt(time[0]) * 60;
        int minutes = Integer.parseInt(time[1]);
        return hourInMinutes + minutes;
    }
}
