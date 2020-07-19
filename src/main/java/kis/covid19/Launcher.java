package kis.covid19;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author naoki
 */
public class Launcher {
    public static void main(String[] args) throws IOException, InterruptedException {
        //var url = "https://www.mhlw.go.jp/content/10906000/000622869.pdf"; // 4/19
        // var url = "https://www.mhlw.go.jp/content/10906000/000623120.pdf"; // 4/20
        // var url = "https://www.mhlw.go.jp/content/10906000/000623669.pdf"; // 4/21
        // var url = "https://www.mhlw.go.jp/content/10906000/000624002.pdf"; // 4/22 same as 4/21
        // var url = "https://www.mhlw.go.jp/stf/newpage_10989.html"; // 4/22
        // var url = "https://www.mhlw.go.jp/stf/newpage_11012.html"; // 4/23
        // var url = "https://www.mhlw.go.jp/content/10906000/000624953.pdf"; // 4/24
        // var url = "https://www.mhlw.go.jp/content/10906000/000625183.pdf"; // 4/25 format error
        // var url = "https://www.mhlw.go.jp/content/10906000/000625313.pdf"; // 4/26
        // var url = "https://www.mhlw.go.jp/stf/newpage_11070.html"; // 4/27
        // var url = "https://www.mhlw.go.jp/stf/newpage_11096.html"; // 4/28
        // var url = "https://www.mhlw.go.jp/content/10906000/000626141.pdf"; // 4/29
        // var url = "https://www.mhlw.go.jp/stf/newpage_11118.html"; // 4/30
        // var url = "https://www.mhlw.go.jp/stf/newpage_11146.html"; // 5/1
        // var url = "https://www.mhlw.go.jp/content/10906000/000627448.pdf"; //5/2
        // var url = "https://www.mhlw.go.jp/content/10906000/000627489.pdf"; // 5/3
        // var url = "https://www.mhlw.go.jp/content/10906000/000627542.pdf"; // 5/4
        // var url = "https://www.mhlw.go.jp/content/10906000/000627581.pdf"; // 5/5

        // var tokyo = "https://www.bousai.metro.tokyo.lg.jp/_res/projects/default_project/_page_/001/007/825/20200505.pdf"; // 5/5
        // var url= "https://www.mhlw.go.jp/content/10906000/000627630.pdf"; // 5/6

        //var tokyo = "https://www.bousai.metro.tokyo.lg.jp/_res/projects/default_project/_page_/001/007/826/2020050601.pdf"; // 5/6
        // var url = "https://www.mhlw.go.jp/stf/newpage_11189.html"; // 5/7

        // var tokyo = "https://www.bousai.metro.tokyo.lg.jp/_res/projects/default_project/_page_/001/007/834/2020050701.pdf"; // 5/7
        // var url = "https://www.mhlw.go.jp/stf/newpage_11222.html"; // 5/8

        var tokyo = "https://www.bousai.metro.tokyo.lg.jp/_res/projects/default_project/_page_/001/007/842/2020050801.pdf"; // 5/8
        // var url = "https://www.mhlw.go.jp/content/10906000/000628667.pdf"; // 5/9

        // var url = "https://www.mhlw.go.jp/content/10906000/000628697.pdf"; // 5/10
        // var url = "https://www.mhlw.go.jp/content/10906000/000628917.pdf"; // 5/11
        // var url = "https://www.mhlw.go.jp/content/10906000/000629544.pdf"; // 5/12
        // var url = "https://www.mhlw.go.jp/content/10906000/000630162.pdf"; // 5/13
        // var url = "https://www.mhlw.go.jp/content/10906000/000630627.pdf"; // 5/14
        // var url = "https://www.mhlw.go.jp/content/10906000/000630926.pdf"; // 5/15
        // var url = "https://www.mhlw.go.jp/content/10906000/000631063.pdf"; // 5/16
        // var url = "https://www.mhlw.go.jp/content/10906000/000631149.pdf"; // 5/17
        // var url = "https://www.mhlw.go.jp/content/10906000/000631432.pdf"; // 5/18
        // var url = "https://www.mhlw.go.jp/content/10906000/000631887.pdf"; // 5/19
        // var url = "https://www.mhlw.go.jp/content/10906000/000632235.pdf"; // 5/20
        // var url = "https://www.mhlw.go.jp/content/10906000/000632553.pdf"; // 5/21
        // var url = "https://www.mhlw.go.jp/content/10906000/000632894.pdf"; // 5/22
        // var url = "https://www.mhlw.go.jp/content/10906000/000633030.pdf"; // 5/23
        // var url = "https://www.mhlw.go.jp/content/10906000/000633053.pdf"; // 5/24
        // var url = "https://www.mhlw.go.jp/content/10906000/000633317.pdf"; // 5/25
        // var url = "https://www.mhlw.go.jp/content/10906000/000633681.pdf"; // 5/26
        // var url = "https://www.mhlw.go.jp/content/10906000/000634251.pdf"; // 5/27
        // var url = "https://www.mhlw.go.jp/content/10906000/000634785.pdf"; // 5/28
        // var url = "https://www.mhlw.go.jp/content/10906000/000635195.pdf"; // 5/29
        // var url = "https://www.mhlw.go.jp/content/10906000/000635510.pdf"; // 5/30
        // var url = "https://www.mhlw.go.jp/content/10906000/000635537.pdf"; // 5/31
        // var url = "https://www.mhlw.go.jp/content/10906000/000635776.pdf"; // 6/1
        // var url = "https://www.mhlw.go.jp/content/10906000/000636132.pdf"; // 6/2
        // var url = "https://www.mhlw.go.jp/content/10906000/000636582.pdf"; // 6/3
        // var url = "https://www.mhlw.go.jp/content/10906000/000636975.pdf"; // 6/4
        // var url = "https://www.mhlw.go.jp/content/10906000/000637374.pdf"; // 6/5
        // var url = "https://www.mhlw.go.jp/content/10906000/000637517.pdf"; // 6/6
        // var url = "https://www.mhlw.go.jp/content/10906000/000637546.pdf"; // 6/7
        // var url = "https://www.mhlw.go.jp/content/10906000/000637876.pdf"; // 6/8
        // var url = "https://www.mhlw.go.jp/content/10906000/000638332.pdf"; // 6/9
        // var url = "https://www.mhlw.go.jp/content/10906000/000638691.pdf"; // 6/10
        // var url = "https://www.mhlw.go.jp/content/10906000/000638967.pdf"; // 6/11
        // var url = "https://www.mhlw.go.jp/content/10906000/000639342.pdf"; // 6/12
        // var url = "https://www.mhlw.go.jp/content/10906000/000639746.pdf"; // 6/13
        // var url = "https://www.mhlw.go.jp/content/10906000/000639769.pdf"; // 6/14
        // var url = "https://www.mhlw.go.jp/content/10906000/000640010.pdf"; // 6/15
        // var url = "https://www.mhlw.go.jp/content/10906000/000640393.pdf"; // 6/16
        // var url = "https://www.mhlw.go.jp/content/10906000/000640745.pdf"; // 6/17
        // var url = "https://www.mhlw.go.jp/content/10906000/000641280.pdf"; // 6/18
        // var url = "https://www.mhlw.go.jp/content/10906000/000641750.pdf"; // 6/19
        // var url = "https://www.mhlw.go.jp/content/10906000/000641944.pdf"; //6/20
        // var url = "https://www.mhlw.go.jp/content/10906000/000641965.pdf"; // 6/21
        // var url = "https://www.mhlw.go.jp/content/10906000/000642091.pdf"; // 6/22
        // var url = "https://www.mhlw.go.jp/content/10906000/000642428.pdf"; // 6/23
        // var url = "https://www.mhlw.go.jp/content/10906000/000642772.pdf"; // 6/24
        // var url = "https://www.mhlw.go.jp/content/10906000/000643528.pdf"; // 6/25
        // var url = "https://www.mhlw.go.jp/content/10906000/000644139.pdf"; // 6/26
        // var url = "https://www.mhlw.go.jp/content/10906000/000644329.pdf"; // 6/27
        // var url = "https://www.mhlw.go.jp/content/10906000/000644367.pdf"; // 6/28
        // var url = "https://www.mhlw.go.jp/content/10906000/000644583.pdf"; // 6/29
        // var url = "https://www.mhlw.go.jp/content/10906000/000645007.pdf"; // 6/30
        // var url = "https://www.mhlw.go.jp/content/10906000/000645320.pdf"; // 7/1
        // var url = "https://www.mhlw.go.jp/content/10906000/000645663.pdf"; // 7/2
        // var url = "https://www.mhlw.go.jp/content/10906000/000646194.pdf"; // 7/3 日付がとれず。文字化けあり
        // var url = "https://www.mhlw.go.jp/content/10906000/000646571.pdf"; // 7/4 日付がとれず。文字化けあり
        // var url = "https://www.mhlw.go.jp/stf/newpage_12250.html"; // 7/5
        // var url = "https://www.mhlw.go.jp/stf/newpage_12269.html"; // 7/6 // 日付エラー。文字化けあり
        // var url = "https://www.mhlw.go.jp/stf/newpage_12287.html"; // 7/7
        // var url = "https://www.mhlw.go.jp/stf/newpage_12312.html"; // 7/8
        // var url = "https://www.mhlw.go.jp/stf/newpage_12339.html"; // 7/9
        // var url = "https://www.mhlw.go.jp/stf/newpage_12360.html"; // 7/10
        // var url = "https://www.mhlw.go.jp/stf/newpage_12375.html"; // 7/11
        // var url = "https://www.mhlw.go.jp/stf/newpage_12378.html"; // 7/12
        // var url = "https://www.mhlw.go.jp/stf/newpage_12392.html"; // 7/13
        // var url = "https://www.mhlw.go.jp/stf/newpage_12427.html"; // 7/14
        // var url = "https://www.mhlw.go.jp/stf/newpage_12450.html"; // 7/15
        // var url = "https://www.mhlw.go.jp/stf/newpage_12467.html"; // 7/16
        // var url = "https://www.mhlw.go.jp/stf/newpage_12500.html"; // 7/17
        // var url = "https://www.mhlw.go.jp/stf/newpage_12515.html"; // 7/18
        var url = "https://www.mhlw.go.jp/stf/newpage_12519.html"; // 7/19

        if (true) {
            // since 5/9
            if (url.endsWith("html")) {
                url = ScrapeFromMhlwPDF2.getPDFUrl(url);
            }
            ScrapeFromMhlwPDF2.scrape(url);
        } else {
            // until 5/8
            LocalDate date;
            if (url.endsWith(".pdf")) {
                date = ScrapeDetailFromMhlwPDF.scrape(url);
            } else {
                date = ScrapeDetailFromMhlw.scrape(url);
            }
            ScrapeFromTokyo.amendTokyo(tokyo, date);
        }
        CreateData.main(args);
    }
}
