package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveSubFolderTest {
    @Test
    void test() {
        String[] folder = {"/a/b/c","/a/b/ca","/a/b/d"};
        RemoveSubFolder uut = new RemoveSubFolder();
        List<String> result =  uut.removeSubfolders(folder);
        System.out.println(result);
    }
}