package com.ctrip.hotel.test.leetcodeDaily.month07.d0715;

import java.util.*;
import java.util.stream.Collectors;

public class Solution0715_721 {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int length = accounts.size();
        List<List<String>> list = new ArrayList<>();
        for (int i=0;i<length;i++){
            for (int j=i+1;j<length;j++){
                List<String> list1 = new ArrayList<>(accounts.get(i));
                List<String> list2 = new ArrayList<>(accounts.get(j));
                if (list1.size()>0 && list2.size()>0){
                    String name1 = list1.get(0);
                    String name2 = list2.get(0);
                    list1.remove(name1);
                    list2.remove(name2);
                    list1.retainAll(list2);
                    if (list1!=null && list1.size()>0){
                        List<String> list3 = new ArrayList<>(accounts.get(i));
                        list3.remove(name1);
                        accounts.get(j).addAll(list3);
                        accounts.set(i,new ArrayList<>());
                    }
                }
            }
        }
        accounts.removeIf(item ->item.size()==0);
        for (int m = 0;m<accounts.size();m++){
            List<String> stringList = accounts.get(m);
            String name = stringList.get(0);
            stringList = stringList.stream().distinct().collect(Collectors.toList());
            stringList.remove(name);
            Collections.sort(stringList);
            stringList.add(0,name);
            accounts.set(m,stringList);
        }
        return accounts;
    }

    public static void main(String[] args) {
        Solution0715_721 solution0715_721 = new Solution0715_721();
        List<List<String>> accounts = new ArrayList<>();
        accounts.add(new ArrayList<>(Arrays.asList("David","David0@m.co","David1@m.co")));
        accounts.add(new ArrayList<>(Arrays.asList("David","David3@m.co","David4@m.co")));
        accounts.add(new ArrayList<>(Arrays.asList("David","David4@m.co","David5@m.co")));
        accounts.add(new ArrayList<>(Arrays.asList("David","David2@m.co","David3@m.co")));
        accounts.add(new ArrayList<>(Arrays.asList("David","David1@m.co","David2@m.co")));
        List<List<String>> list = solution0715_721.accountsMerge(accounts);
        System.out.println(list);


    }
}
