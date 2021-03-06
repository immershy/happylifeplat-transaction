package com.happylifeplat.transaction.common.netty.serizlize.kryo;

import com.happylifeplat.transaction.common.netty.MessageCodecService;
import com.happylifeplat.transaction.common.netty.serizlize.MessageDecoder;

/**
 * <p>Description: .</p>
 * <p>Company: 深圳市旺生活互联网科技有限公司</p>
 * <p>Copyright: 2015-2017 happylifeplat.com All Rights Reserved</p>
 *  Kryo 转换器
 * @author yu.xiao@happylifeplat.com
 * @version 1.0
 * @date 2017/7/18 15:57
 * @since JDK 1.8
 */
public class KryoDecoder  extends MessageDecoder {

    public KryoDecoder(MessageCodecService service) {
        super(service);
    }
}
