package ctci.arraysandstrings;

import java.util.Arrays;

public class Question3 {

    public void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index, i = 0;
        for(i = 0; i < trueLength; i++) {
            if(str[i] == ' ') {
                spaceCount++;
            }
        }
        index = trueLength + spaceCount * 2;
        //if(trueLength < str.length) str[trueLength] = '\0'; //end of array
        for (i = trueLength - 1; i > 0; i --) {
            char c = str[i];
            if(str[i] == ' ') {
                str[index-1] = '0';
                str[index-2] = '2';
                str[index-3] = '%';
                index = index - 3;
            } else {
                str[index-1] = str[i];
                index--;
            }

        }
        System.out.println(str);

    }
}
