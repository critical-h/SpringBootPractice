package kr.co.m114.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * SampleService
 */
@Service
public class SampleService {
  public List<SampleModel> getList(){
    List<SampleModel> list = new ArrayList<>();
    { SampleModel po = new SampleModel(); po.setId("root");    po.setParent("#");	    po.setSeq(1);         po.setText("주제별통계");             list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("6");       po.setParent("root");	  po.setSeq(6);         po.setText("인구/가구");              list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("7");       po.setParent("6");	    po.setSeq(7);         po.setText("인구변화");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("711");     po.setParent("7");	    po.setSeq(711);       po.setText("저출산");                 list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("712");     po.setParent("7");	    po.setSeq(712);       po.setText("고령화");                 list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("713");     po.setParent("7");	    po.setSeq(713);       po.setText("출생/사망");              list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("714");     po.setParent("7");	    po.setSeq(714);       po.setText("결혼/이혼");              list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("751");     po.setParent("7");	    po.setSeq(751);       po.setText("이민/입양");              list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("8");       po.setParent("6");	    po.setSeq(8);         po.setText("생애주기");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("10");      po.setParent("8");	    po.setSeq(10);        po.setText("영유아");                 list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("715");     po.setParent("8");	    po.setSeq(715);       po.setText("아동/청소년");            list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("716");     po.setParent("8");	    po.setSeq(716);       po.setText("청년");                   list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("717");     po.setParent("8");	    po.setSeq(717);       po.setText("베이비부머");             list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("718");     po.setParent("8");	    po.setSeq(718);       po.setText("노인");                   list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("719");     po.setParent("8");	    po.setSeq(719);       po.setText("장애인");                 list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("720");     po.setParent("8");	    po.setSeq(720);       po.setText("여성");                   list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("721");     po.setParent("6");	    po.setSeq(721);       po.setText("가족");                   list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("722");     po.setParent("721");	  po.setSeq(722);       po.setText("한부모");                 list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("723");     po.setParent("721");	  po.setSeq(723);       po.setText("다문화");                 list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("11");      po.setParent("root");	  po.setSeq(11);        po.setText("보건의료");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("12");      po.setParent("11");	    po.setSeq(12);        po.setText("건강보장");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("13");      po.setParent("12");	    po.setSeq(13);        po.setText("의료안전망");             list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("14");      po.setParent("12");	    po.setSeq(14);        po.setText("의료지원");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("102");     po.setParent("11");	    po.setSeq(102);       po.setText("건강증진");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("103");     po.setParent("102");	  po.setSeq(103);       po.setText("생활습관병");             list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("104");     po.setParent("102");	  po.setSeq(104);       po.setText("정신건강");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("105");     po.setParent("102");	  po.setSeq(105);       po.setText("만성질환");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("17");      po.setParent("11");	    po.setSeq(17);        po.setText("보건산업");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("19");      po.setParent("17");	    po.setSeq(19);        po.setText("의료기기산업");           list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("20");      po.setParent("17");	    po.setSeq(20);        po.setText("화장품산업");             list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("21");      po.setParent("17");	    po.setSeq(21);        po.setText("식품산업");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("22");      po.setParent("11");	    po.setSeq(22);        po.setText("보건일반");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("25");      po.setParent("root");	  po.setSeq(25);        po.setText("사회복지");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("26");      po.setParent("25");	    po.setSeq(26);        po.setText("사회보험");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("106");     po.setParent("26");	    po.setSeq(106);       po.setText("건강보험");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("724");     po.setParent("26");	    po.setSeq(724);       po.setText("노인장기요양보험");       list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("725");     po.setParent("26");	    po.setSeq(725);       po.setText("고용보험");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("726");     po.setParent("26");	    po.setSeq(726);       po.setText("산재보험");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("108");     po.setParent("25");	    po.setSeq(108);       po.setText("공공부조");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("109");     po.setParent("108");	  po.setSeq(109);       po.setText("기초생활보장");           list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("110");     po.setParent("108");	  po.setSeq(110);       po.setText("근로빈곤/자활");          list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("727");     po.setParent("108");	  po.setSeq(727);       po.setText("차상위지원");             list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("728");     po.setParent("108");	  po.setSeq(728);       po.setText("기초연금/장애인연금");    list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("36");      po.setParent("25");	    po.setSeq(36);        po.setText("사회서비스");             list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("37");      po.setParent("36");	    po.setSeq(37);        po.setText("보육/교육");              list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("38");      po.setParent("36");	    po.setSeq(38);        po.setText("돌봄(노인/장애인)");      list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("39");      po.setParent("36");	    po.setSeq(39);        po.setText("주거/에너지/환경");       list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("40");      po.setParent("36");	    po.setSeq(40);        po.setText("고용/일자리");            list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("41");      po.setParent("36");	    po.setSeq(41);        po.setText("문화");                   list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("44");      po.setParent("25");	    po.setSeq(44);        po.setText("복지행정");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("45");      po.setParent("44");	    po.setSeq(45);        po.setText("전달체계");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("729");     po.setParent("44");	    po.setSeq(729);       po.setText("바우처");                 list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("112");     po.setParent("25");	    po.setSeq(112);       po.setText("민간복지");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("196");     po.setParent("112");	  po.setSeq(196);       po.setText("복지자원");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("197");     po.setParent("112");	  po.setSeq(197);       po.setText("사회참여/자원봉사");      list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("198");     po.setParent("112");	  po.setSeq(198);       po.setText("사회공헌/기부");          list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("113");     po.setParent("25");	    po.setSeq(113);       po.setText("복지일반");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("46");      po.setParent("root");	  po.setSeq(46);        po.setText("지역사회");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("236");     po.setParent("46");	    po.setSeq(236);       po.setText("농어촌");                 list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("237");     po.setParent("46");	    po.setSeq(237);       po.setText("지역복지");               list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("51");      po.setParent("root");	  po.setSeq(51);        po.setText("사회통합/행복/삶의질");   list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("53");      po.setParent("root");	  po.setSeq(53);        po.setText("소득/재산/소비");         list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("65");      po.setParent("root");	  po.setSeq(65);        po.setText("빈곤/불평등");            list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("62");      po.setParent("root");	  po.setSeq(62);        po.setText("조세/재정");              list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("64");      po.setParent("root");	  po.setSeq(64);        po.setText("조사/통계/정보");         list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("730");     po.setParent("root");	  po.setSeq(730);       po.setText("통일/보훈");              list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("731");     po.setParent("root");	  po.setSeq(731);       po.setText("복지국가비교");           list.add(po); }
    { SampleModel po = new SampleModel(); po.setId("732");     po.setParent("root");	  po.setSeq(732);       po.setText("미래사회");               list.add(po); }
    return list;
  }
/*
List<SampleModel> list = new ArrayList<>();
{ SampleModel po = new SampleModel(); po.setId("root");    po.setParent("#");	    po.setSeq(1);         po.setText("주제별통계");             list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("6");       po.setParent("root");	  po.setSeq(6);         po.setText("인구/가구");              list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("7");       po.setParent("6");	    po.setSeq(7);         po.setText("인구변화");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("711");     po.setParent("7");	    po.setSeq(711);       po.setText("저출산");                 list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("712");     po.setParent("7");	    po.setSeq(712);       po.setText("고령화");                 list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("713");     po.setParent("7");	    po.setSeq(713);       po.setText("출생/사망");              list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("714");     po.setParent("7");	    po.setSeq(714);       po.setText("결혼/이혼");              list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("751");     po.setParent("7");	    po.setSeq(751);       po.setText("이민/입양");              list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("8");       po.setParent("6");	    po.setSeq(8);         po.setText("생애주기");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("10");      po.setParent("8");	    po.setSeq(10);        po.setText("영유아");                 list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("715");     po.setParent("8");	    po.setSeq(715);       po.setText("아동/청소년");            list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("716");     po.setParent("8");	    po.setSeq(716);       po.setText("청년");                   list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("717");     po.setParent("8");	    po.setSeq(717);       po.setText("베이비부머");             list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("718");     po.setParent("8");	    po.setSeq(718);       po.setText("노인");                   list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("719");     po.setParent("8");	    po.setSeq(719);       po.setText("장애인");                 list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("720");     po.setParent("8");	    po.setSeq(720);       po.setText("여성");                   list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("721");     po.setParent("6");	    po.setSeq(721);       po.setText("가족");                   list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("722");     po.setParent("721");	  po.setSeq(722);       po.setText("한부모");                 list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("723");     po.setParent("721");	  po.setSeq(723);       po.setText("다문화");                 list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("11");      po.setParent("root");	  po.setSeq(11);        po.setText("보건의료");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("12");      po.setParent("11");	    po.setSeq(12);        po.setText("건강보장");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("13");      po.setParent("12");	    po.setSeq(13);        po.setText("의료안전망");             list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("14");      po.setParent("12");	    po.setSeq(14);        po.setText("의료지원");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("102");     po.setParent("11");	    po.setSeq(102);       po.setText("건강증진");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("103");     po.setParent("102");	  po.setSeq(103);       po.setText("생활습관병");             list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("104");     po.setParent("102");	  po.setSeq(104);       po.setText("정신건강");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("105");     po.setParent("102");	  po.setSeq(105);       po.setText("만성질환");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("17");      po.setParent("11");	    po.setSeq(17);        po.setText("보건산업");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("19");      po.setParent("17");	    po.setSeq(19);        po.setText("의료기기산업");           list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("20");      po.setParent("17");	    po.setSeq(20);        po.setText("화장품산업");             list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("21");      po.setParent("17");	    po.setSeq(21);        po.setText("식품산업");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("22");      po.setParent("11");	    po.setSeq(22);        po.setText("보건일반");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("25");      po.setParent("root");	  po.setSeq(25);        po.setText("사회복지");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("26");      po.setParent("25");	    po.setSeq(26);        po.setText("사회보험");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("106");     po.setParent("26");	    po.setSeq(106);       po.setText("건강보험");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("724");     po.setParent("26");	    po.setSeq(724);       po.setText("노인장기요양보험");       list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("725");     po.setParent("26");	    po.setSeq(725);       po.setText("고용보험");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("726");     po.setParent("26");	    po.setSeq(726);       po.setText("산재보험");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("108");     po.setParent("25");	    po.setSeq(108);       po.setText("공공부조");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("109");     po.setParent("108");	  po.setSeq(109);       po.setText("기초생활보장");           list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("110");     po.setParent("108");	  po.setSeq(110);       po.setText("근로빈곤/자활");          list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("727");     po.setParent("108");	  po.setSeq(727);       po.setText("차상위지원");             list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("728");     po.setParent("108");	  po.setSeq(728);       po.setText("기초연금/장애인연금");    list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("36");      po.setParent("25");	    po.setSeq(36);        po.setText("사회서비스");             list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("37");      po.setParent("36");	    po.setSeq(37);        po.setText("보육/교육");              list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("38");      po.setParent("36");	    po.setSeq(38);        po.setText("돌봄(노인/장애인)");      list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("39");      po.setParent("36");	    po.setSeq(39);        po.setText("주거/에너지/환경");       list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("40");      po.setParent("36");	    po.setSeq(40);        po.setText("고용/일자리");            list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("41");      po.setParent("36");	    po.setSeq(41);        po.setText("문화");                   list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("44");      po.setParent("25");	    po.setSeq(44);        po.setText("복지행정");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("45");      po.setParent("44");	    po.setSeq(45);        po.setText("전달체계");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("729");     po.setParent("44");	    po.setSeq(729);       po.setText("바우처");                 list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("112");     po.setParent("25");	    po.setSeq(112);       po.setText("민간복지");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("196");     po.setParent("112");	  po.setSeq(196);       po.setText("복지자원");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("197");     po.setParent("112");	  po.setSeq(197);       po.setText("사회참여/자원봉사");      list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("198");     po.setParent("112");	  po.setSeq(198);       po.setText("사회공헌/기부");          list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("113");     po.setParent("25");	    po.setSeq(113);       po.setText("복지일반");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("46");      po.setParent("root");	  po.setSeq(46);        po.setText("지역사회");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("236");     po.setParent("46");	    po.setSeq(236);       po.setText("농어촌");                 list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("237");     po.setParent("46");	    po.setSeq(237);       po.setText("지역복지");               list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("51");      po.setParent("root");	  po.setSeq(51);        po.setText("사회통합/행복/삶의질");   list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("53");      po.setParent("root");	  po.setSeq(53);        po.setText("소득/재산/소비");         list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("65");      po.setParent("root");	  po.setSeq(65);        po.setText("빈곤/불평등");            list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("62");      po.setParent("root");	  po.setSeq(62);        po.setText("조세/재정");              list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("64");      po.setParent("root");	  po.setSeq(64);        po.setText("조사/통계/정보");         list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("730");     po.setParent("root");	  po.setSeq(730);       po.setText("통일/보훈");              list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("731");     po.setParent("root");	  po.setSeq(731);       po.setText("복지국가비교");           list.add(po); }
{ SampleModel po = new SampleModel(); po.setId("732");     po.setParent("root");	  po.setSeq(732);       po.setText("미래사회");               list.add(po); }
*/

}