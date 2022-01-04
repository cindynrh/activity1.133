/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PratikumKtp.DataKtp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
public class TableController {
    @RequestMapping("/TableDataKtp")
    //ResponseBody
    public String getTable(Model isi){
        String result = "Table Data KTP";
        isi.addAttribute("ListData", result);
        
        //DataKtp data = new DataKtp();
      ArrayList<List<String>> data = new ArrayList<>();
        data.add(0,Arrays.asList("ID","Nomer KTP","Nama","Alamat"));
        data.add(1,Arrays.asList("1","20190140125","Ananda Rizky","Melayu"));
        data.add(2,Arrays.asList("2","20190140126","Aninda Salsabilla","Jakarta"));
        data.add(3,Arrays.asList("3","20190140127","Bintang Permata Sari","Medan"));
        data.add(4,Arrays.asList("4","20190140128","Brandon Salim","Jerman"));
        data.add(5,Arrays.asList("5","20190140129","Cantika","Padang"));
        data.add(6,Arrays.asList("6","2020140133","Cindy Nurhabibah","Jakarta"));
        data.add(7,Arrays.asList("7","20200140134","Diva inggar","Depok"));
        data.add(8,Arrays.asList("8","20200140135","Dimas anggara","Pekanbaru"));
        data.add(9,Arrays.asList("9","20200140136","Dhimas Aji","Bekasi"));
        data.add(10,Arrays.asList("10","20200140137","Elvaretta Winda","Purworejo"));
        data.add(11,Arrays.asList("11","20200140138","Elisabeth","Kupang"));
        data.add(12,Arrays.asList("12","20200140139","Farhandika","Lampung"));
        data.add(13,Arrays.asList("13","20200140140","Farasya","Prancis"));
        data.add(14,Arrays.asList("14","20210140111","Gania Binar","Ternate"));
        data.add(15,Arrays.asList("15","20210140112","Hanifa Adriana","Tegal"));
        data.add(16,Arrays.asList("16","20210140113","Inggar Anggi","Makassar"));
        data.add(17,Arrays.asList("17","20210140114","Jason Ilham","Majalengka"));
        data.add(18,Arrays.asList("18","20210140115","Jhehan Jhihan","Aceh"));
        data.add(19,Arrays.asList("19","20210140116","Syasyabilla","Polandia"));
        data.add(20,Arrays.asList("20","20210140118","Zildjian","Ambon"));
        
        isi.addAttribute("ListData", data);
        
        return "tableviewer";
                
        
    }
}
