package com.example.api_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    final static String TAG = "walkerProject";

    TextView tv_result;
    String tv_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_result = (TextView)findViewById(R.id.tv_result);

        new Thread(new Runnable() {
            @Override
            public void run() {
                tv_data = getTrainXmlData();

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tv_result.setText(tv_data);
                    }
                });
            }
        }).start();
    }

    String getTrainXmlData(){
        StringBuffer buffer = new StringBuffer();

        String numOfRows = "1";
        String pageNo = "1";
        String depPlaceId = "NAT010000";
        String arrPlaceId = "NAT011668";
        String depPlandTime = "20201201";
        String trainGradeCode = "00";
        String serviceKey = "%2ByDVFKJSt3p6oWsiDAQgFltnE8s174qQhJXUKsGQ5%2B2PyknH5ZbFrQOUzAgJ84TIpskV%2F8Kon5PwxKdWLxYb2Q%3D%3D";

        String queryUrl = "http://openapi.tago.go.kr/openapi/service/TrainInfoService/getStrtpntAlocFndTrainInfo" +
                "?serviceKey=" + serviceKey + "&numOfRows="+ numOfRows + "&pageNo=" + pageNo + "&depPlaceId=" + depPlaceId +
                "&arrPlaceId=" + arrPlaceId + "&depPlandTime=" + depPlandTime + "&trainGradeCode=" + trainGradeCode;

        try{
            URL url = new URL(queryUrl);
            InputStream is = url.openStream();

            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser xpp = factory.newPullParser();
            xpp.setInput(new InputStreamReader(is, "UTF-8"));

            String tag;
            xpp.next();
            int eventType = xpp.getEventType();

            while (eventType != XmlPullParser.END_DOCUMENT){
                switch (eventType){
                    case XmlPullParser.START_DOCUMENT:
                        break;

                    case XmlPullParser.START_TAG:
                        tag = xpp.getName();

                        if (tag.equals("item")) ;
                        else if (tag.equals("adultcharge")) {
                            buffer.append("요금 : ");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        }
                        else if (tag.equals("arrplacename")) {
                            buffer.append("도착지 : ");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        }
                        else if (tag.equals("arrplandtime")) {
                            buffer.append("도착 시간 : ");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        }
                        else if (tag.equals("depplacename")) {
                            buffer.append("출발지 : ");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        }
                        else if (tag.equals("depplandtime")){
                            buffer.append("출발 시간 : ");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        }
                        else if (tag.equals("traingradename")) {
                            buffer.append("기차 종류 : ");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        }
                        else if (tag.equals("trainno")) {
                            buffer.append("열차번호 : ");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        }
                        break;
                    case XmlPullParser.TEXT:
                        break;
                    case XmlPullParser.END_TAG:
                        tag = xpp.getName();
                        if (tag.equals("item")) buffer.append("\n");
                        break;
                }
                eventType = xpp.next();
            }
        } catch (Exception e) {
            //TODO Auto-generated catch block.printStackTrace();
        }
        return buffer.toString();
    }
}