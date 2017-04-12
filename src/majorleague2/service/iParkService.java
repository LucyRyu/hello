package majorleague2.service;

import majorleague2.model.KindOfPark;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public interface iParkService {

    int howManyHaveUSContry(List<KindOfPark> list);
    //추상메소드 : body가 없는 메소드.
    List<KindOfPark> howManyHaveAlias(List<KindOfPark> parklist);
    double CountStringLength(List<KindOfPark> parklist);





}
