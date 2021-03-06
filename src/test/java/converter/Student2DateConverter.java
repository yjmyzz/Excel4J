package converter;

import com.github.crab2died.constant.LanguageEnum;
import com.github.crab2died.converter.WriteConvertible;
import com.github.crab2died.utils.DateUtils;

import java.util.Date;

/**
 * 导出excel日期数据转换器
 */
public class Student2DateConverter implements WriteConvertible {

    @Override
    public Object execWrite(Object object) {
        return execWrite(object, null);
    }

    @Override
    public Object execWrite(Object object, String language) {
        Date date = (Date) object;
        if (!LanguageEnum.CHINESE.getValue().equalsIgnoreCase(language)) {
            return DateUtils.date2Str(date, DateUtils.DATE_FORMAT_DAY_EN);
        } else {
            return DateUtils.date2Str(date, DateUtils.DATE_FORMAT_DAY);
        }
    }
}
