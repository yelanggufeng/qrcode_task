package com.mobiusvision.qrcode.config;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mobiusvision.qrcode.entity.mysql.mysql_BP_BATCH;
import com.mobiusvision.qrcode.entity.mysql.mysql_BP_DIST_LINE;
import com.mobiusvision.qrcode.entity.mysql.mysql_BP_ORDER_BARCODE;
import com.mobiusvision.qrcode.entity.mysql.mysql_BP_ORDER_CIG_INFO;
import com.mobiusvision.qrcode.entity.mysql.mysql_BP_ORDER_INFO;
import com.mobiusvision.qrcode.mapper.*;
import com.mobiusvision.qrcode.mapper.BpBatchMapper;
import com.mobiusvision.qrcode.mapper.BpDistLineMapper;
import com.mobiusvision.qrcode.mapper.BpOrderBarcodeMapper;
import com.mobiusvision.qrcode.mapper.BpOrderCigInfoMapper;
import com.mobiusvision.qrcode.mapper.BpOrderInfoMapper;
import com.mobiusvision.qrcode.service.BpOrderService;
import com.mobiusvision.qrcode.utils.DateUtil;
import com.mobiusvision.qrcode.utils.SecretUtil;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

@Component
public class tasktongbu {
    private final Logger log = LoggerFactory.getLogger(tasktongbu.class);
    @Autowired
    private TestMapper testMapper;
    @Autowired
    private Test2Mapper testMapper2;
    @Autowired
    private Test3Mapper testMapper3;
    @Autowired
    private Test4Mapper testMapper4;
    @Autowired
    BpOrderService bpOrderService;
    @Autowired
    BpBatchMapper bp_batchMapper;
    @Autowired
    BpDistLineMapper bp_dist_lineMapper;
    @Autowired
    BpOrderBarcodeMapper bp_order_barcodeMapper;
    @Autowired
    BpOrderCigInfoMapper bp_order_cig_infoMapper;
    @Autowired
    BpOrderInfoMapper bp_order_infoMapper;

    public tasktongbu() {
    }
//定时器（根据毫秒定时）
    @Scheduled(
            fixedRate = 10800000L
    )
    public void tongbu1() throws Exception {
        try {
            try {
                List<mysql_BP_BATCH> list1 = this.testMapper.selectbp_batch();
                List<mysql_BP_ORDER_BARCODE> list2 = this.testMapper.selectbp_order_barcode(DateUtil.getPastDate(3), DateUtil.getFetureDate(1));
                List<mysql_BP_DIST_LINE> list3 = this.testMapper.selectbp_dist_line();
                List<mysql_BP_ORDER_CIG_INFO> list4 = this.testMapper.selectbp_order_cig_info();
                List<mysql_BP_ORDER_INFO> list5 = this.testMapper.selectbp_order_info();

                int i;
                QueryWrapper queryWrapper;
                List qc;
                for(i = 0; i < list1.size(); ++i) {
                    ((mysql_BP_BATCH)list1.get(i)).setID(SecretUtil.uuid());
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("B_UUID", ((mysql_BP_BATCH)list1.get(i)).getB_UUID());
                    qc = this.bp_batchMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        this.bp_batchMapper.insert(list1.get(i));
                        this.log.info("库插入 BP_BATCH表:" + list1.get(i));
                    } else {
                        this.log.info("BP_BATCH表插入过了");
                    }
                }

                for(i = 0; i < list2.size(); ++i) {
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("OB_BCIG_BARCODE", ((mysql_BP_ORDER_BARCODE)list2.get(i)).getOB_BCIG_BARCODE());
                    qc = this.bp_order_barcodeMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        ((mysql_BP_ORDER_BARCODE)list2.get(i)).setID(SecretUtil.uuid());
                        this.bp_order_barcodeMapper.insert(list2.get(i));
                        this.log.info("库插入 BP_ORDER_BARCODE表:" + list2.get(i));
                    } else {
                        this.log.info("BP_ORDER_BARCODE表插入过了");
                    }
                }

                for(i = 0; i < list3.size(); ++i) {
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("DL_UUID", ((mysql_BP_DIST_LINE)list3.get(i)).getDL_UUID());
                    queryWrapper.eq("DL_B_UUID", ((mysql_BP_DIST_LINE)list3.get(i)).getDL_B_UUID());
                    qc = this.bp_dist_lineMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        ((mysql_BP_DIST_LINE)list3.get(i)).setID(SecretUtil.uuid());
                        this.bp_dist_lineMapper.insert(list3.get(i));
                        this.log.info("库插入 BP_DIST_LINE表:" + list3.get(i));
                    } else {
                        this.log.info("BP_DIST_LINE表插入过了");
                    }
                }

                for(i = 0; i < list4.size(); ++i) {
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("OCI_UUID", ((mysql_BP_ORDER_CIG_INFO)list4.get(i)).getOCI_UUID());
                    queryWrapper.eq("OCI_CIG_BRAND", ((mysql_BP_ORDER_CIG_INFO)list4.get(i)).getOCI_CIG_BRAND());
                    qc = this.bp_order_cig_infoMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        ((mysql_BP_ORDER_CIG_INFO)list4.get(i)).setID(SecretUtil.uuid());
                        this.bp_order_cig_infoMapper.insert(list4.get(i));
                        this.log.info("库插入 BP_ORDER_CIG_INFO表:" + list4.get(i));
                    } else {
                        this.log.info("BP_ORDER_CIG_INFO表插入过了");
                    }
                }

                for(i = 0; i < list5.size(); ++i) {
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("OI_ID", ((mysql_BP_ORDER_INFO)list5.get(i)).getOI_ID());
                    queryWrapper.eq("OI_UUID", ((mysql_BP_ORDER_INFO)list5.get(i)).getOI_UUID());
                    qc = this.bp_order_infoMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        ((mysql_BP_ORDER_INFO)list5.get(i)).setID(SecretUtil.uuid());
                        this.bp_order_infoMapper.insert(list5.get(i));
                        this.log.info("库插入 BP_ORDER_INFO表:" + list5.get(i));
                    } else {
                        this.log.info("BP_ORDER_INFO表插入过了");
                    }
                }
            } catch (Exception var12) {
                System.out.println(var12);
            }

        } finally {
            ;
        }
    }

    @Scheduled(
            fixedRate = 10800000L
    )
    public void tongbu2() throws Exception {
        try {
            try {
                List<mysql_BP_BATCH> list1 = this.testMapper2.selectbp_batch();
                List<mysql_BP_ORDER_BARCODE> list2 = this.testMapper2.selectbp_order_barcode(DateUtil.getPastDate(3), DateUtil.getFetureDate(1));
                List<mysql_BP_DIST_LINE> list3 = this.testMapper2.selectbp_dist_line();
                List<mysql_BP_ORDER_CIG_INFO> list4 = this.testMapper2.selectbp_order_cig_info();
                List<mysql_BP_ORDER_INFO> list5 = this.testMapper2.selectbp_order_info();
                this.log.info("到testMapper2这里了");

                int i;
                QueryWrapper queryWrapper;
                List qc;
                for(i = 0; i < list1.size(); ++i) {
                    ((mysql_BP_BATCH)list1.get(i)).setID(SecretUtil.uuid());
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("B_UUID", ((mysql_BP_BATCH)list1.get(i)).getB_UUID());
                    qc = this.bp_batchMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        this.bp_batchMapper.insert(list1.get(i));
                        this.log.info("库插入 BP_BATCH表:" + list1.get(i));
                    } else {
                        this.log.info("BP_BATCH表插入过了");
                    }
                }

                for(i = 0; i < list2.size(); ++i) {
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("OB_BCIG_BARCODE", ((mysql_BP_ORDER_BARCODE)list2.get(i)).getOB_BCIG_BARCODE());
                    qc = this.bp_order_barcodeMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        ((mysql_BP_ORDER_BARCODE)list2.get(i)).setID(SecretUtil.uuid());
                        this.bp_order_barcodeMapper.insert(list2.get(i));
                        this.log.info("库插入 BP_ORDER_BARCODE表:" + list2.get(i));
                    } else {
                        this.log.info("BP_ORDER_BARCODE表插入过了");
                    }
                }

                for(i = 0; i < list3.size(); ++i) {
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("DL_UUID", ((mysql_BP_DIST_LINE)list3.get(i)).getDL_UUID());
                    queryWrapper.eq("DL_B_UUID", ((mysql_BP_DIST_LINE)list3.get(i)).getDL_B_UUID());
                    qc = this.bp_dist_lineMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        ((mysql_BP_DIST_LINE)list3.get(i)).setID(SecretUtil.uuid());
                        this.bp_dist_lineMapper.insert(list3.get(i));
                        this.log.info("库插入 BP_DIST_LINE表:" + list3.get(i));
                    } else {
                        this.log.info("BP_DIST_LINE表插入过了");
                    }
                }

                for(i = 0; i < list4.size(); ++i) {
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("OCI_UUID", ((mysql_BP_ORDER_CIG_INFO)list4.get(i)).getOCI_UUID());
                    queryWrapper.eq("OCI_CIG_BRAND", ((mysql_BP_ORDER_CIG_INFO)list4.get(i)).getOCI_CIG_BRAND());
                    qc = this.bp_order_cig_infoMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        ((mysql_BP_ORDER_CIG_INFO)list4.get(i)).setID(SecretUtil.uuid());
                        this.bp_order_cig_infoMapper.insert(list4.get(i));
                        this.log.info("库插入 BP_ORDER_CIG_INFO表:" + list4.get(i));
                    } else {
                        this.log.info("BP_ORDER_CIG_INFO表插入过了");
                    }
                }

                for(i = 0; i < list5.size(); ++i) {
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("OI_ID", ((mysql_BP_ORDER_INFO)list5.get(i)).getOI_ID());
                    queryWrapper.eq("OI_UUID", ((mysql_BP_ORDER_INFO)list5.get(i)).getOI_UUID());
                    qc = this.bp_order_infoMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        ((mysql_BP_ORDER_INFO)list5.get(i)).setID(SecretUtil.uuid());
                        this.bp_order_infoMapper.insert(list5.get(i));
                        this.log.info("库插入 BP_ORDER_INFO表:" + list5.get(i));
                    } else {
                        this.log.info("BP_ORDER_INFO表插入过了");
                    }
                }
            } catch (Exception var12) {
                System.out.println(var12);
            }

        } finally {
            ;
        }
    }

    @Scheduled(
            fixedRate = 10800000L
    )
    public void tongbu3() throws Exception {
        try {
            try {
                List<mysql_BP_BATCH> list1 = this.testMapper3.selectbp_batch();
                List<mysql_BP_ORDER_BARCODE> list2 = this.testMapper3.selectbp_order_barcode(DateUtil.getPastDate(3), DateUtil.getFetureDate(1));
                List<mysql_BP_DIST_LINE> list3 = this.testMapper3.selectbp_dist_line();
                List<mysql_BP_ORDER_CIG_INFO> list4 = this.testMapper3.selectbp_order_cig_info();
                List<mysql_BP_ORDER_INFO> list5 = this.testMapper3.selectbp_order_info();
                this.log.info("到testMapper3这里了");

                int i;
                QueryWrapper queryWrapper;
                List qc;
                for(i = 0; i < list1.size(); ++i) {
                    ((mysql_BP_BATCH)list1.get(i)).setID(SecretUtil.uuid());
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("B_UUID", ((mysql_BP_BATCH)list1.get(i)).getB_UUID());
                    qc = this.bp_batchMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        this.bp_batchMapper.insert(list1.get(i));
                        this.log.info("库插入 BP_BATCH表:" + list1.get(i));
                    } else {
                        this.log.info("BP_BATCH表插入过了");
                    }
                }

                for(i = 0; i < list2.size(); ++i) {
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("OB_BCIG_BARCODE", ((mysql_BP_ORDER_BARCODE)list2.get(i)).getOB_BCIG_BARCODE());
                    qc = this.bp_order_barcodeMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        ((mysql_BP_ORDER_BARCODE)list2.get(i)).setID(SecretUtil.uuid());
                        this.bp_order_barcodeMapper.insert(list2.get(i));
                        this.log.info("库插入 BP_ORDER_BARCODE表:" + list2.get(i));
                    } else {
                        this.log.info("BP_ORDER_BARCODE3插入过了");
                    }
                }

                for(i = 0; i < list3.size(); ++i) {
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("DL_UUID", ((mysql_BP_DIST_LINE)list3.get(i)).getDL_UUID());
                    queryWrapper.eq("DL_B_UUID", ((mysql_BP_DIST_LINE)list3.get(i)).getDL_B_UUID());
                    qc = this.bp_dist_lineMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        ((mysql_BP_DIST_LINE)list3.get(i)).setID(SecretUtil.uuid());
                        this.bp_dist_lineMapper.insert(list3.get(i));
                        this.log.info("库插入 BP_DIST_LINE表:" + list3.get(i));
                    } else {
                        this.log.info("BP_DIST_LINE表插入过了");
                    }
                }

                for(i = 0; i < list4.size(); ++i) {
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("OCI_UUID", ((mysql_BP_ORDER_CIG_INFO)list4.get(i)).getOCI_UUID());
                    queryWrapper.eq("OCI_CIG_BRAND", ((mysql_BP_ORDER_CIG_INFO)list4.get(i)).getOCI_CIG_BRAND());
                    qc = this.bp_order_cig_infoMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        ((mysql_BP_ORDER_CIG_INFO)list4.get(i)).setID(SecretUtil.uuid());
                        this.bp_order_cig_infoMapper.insert(list4.get(i));
                        this.log.info("库插入 BP_ORDER_CIG_INFO表:" + list4.get(i));
                    } else {
                        this.log.info("BP_ORDER_CIG_INFO表插入过了");
                    }
                }

                for(i = 0; i < list5.size(); ++i) {
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("OI_ID", ((mysql_BP_ORDER_INFO)list5.get(i)).getOI_ID());
                    queryWrapper.eq("OI_UUID", ((mysql_BP_ORDER_INFO)list5.get(i)).getOI_UUID());
                    qc = this.bp_order_infoMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        ((mysql_BP_ORDER_INFO)list5.get(i)).setID(SecretUtil.uuid());
                        this.bp_order_infoMapper.insert(list5.get(i));
                        this.log.info("库插入 BP_ORDER_INFO表:" + list5.get(i));
                    } else {
                        this.log.info("BP_ORDER_INFO表插入过了");
                    }
                }
            } catch (Exception var12) {
                System.out.println(var12);
            }

        } finally {
            ;
        }
    }

    @Scheduled(
            fixedRate = 10800000L
    )
    public void tongbu4() throws Exception {
        try {
            try {
                List<mysql_BP_BATCH> list1 = this.testMapper4.selectbp_batch();
                List<mysql_BP_ORDER_BARCODE> list2 = this.testMapper4.selectbp_order_barcode(DateUtil.getPastDate(3), DateUtil.getFetureDate(1));
                List<mysql_BP_DIST_LINE> list3 = this.testMapper4.selectbp_dist_line();
                List<mysql_BP_ORDER_CIG_INFO> list4 = this.testMapper4.selectbp_order_cig_info();
                List<mysql_BP_ORDER_INFO> list5 = this.testMapper4.selectbp_order_info();
                this.log.info("到testMapper4这里了");

                int i;
                QueryWrapper queryWrapper;
                List qc;
                for(i = 0; i < list1.size(); ++i) {
                    ((mysql_BP_BATCH)list1.get(i)).setID(SecretUtil.uuid());
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("B_UUID", ((mysql_BP_BATCH)list1.get(i)).getB_UUID());
                    qc = this.bp_batchMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        this.bp_batchMapper.insert(list1.get(i));
                        this.log.info("库插入 BP_BATCH表:" + list1.get(i));
                    } else {
                        this.log.info("BP_BATCH表插入过了");
                    }
                }

                for(i = 0; i < list2.size(); ++i) {
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("OB_BCIG_BARCODE", ((mysql_BP_ORDER_BARCODE)list2.get(i)).getOB_BCIG_BARCODE());
                    qc = this.bp_order_barcodeMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        ((mysql_BP_ORDER_BARCODE)list2.get(i)).setID(SecretUtil.uuid());
                        this.bp_order_barcodeMapper.insert(list2.get(i));
                        this.log.info("库插入 BP_ORDER_BARCODE表:" + list2.get(i));
                    } else {
                        this.log.info("BP_ORDER_BARCODE表插入过了");
                    }
                }

                for(i = 0; i < list3.size(); ++i) {
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("DL_UUID", ((mysql_BP_DIST_LINE)list3.get(i)).getDL_UUID());
                    queryWrapper.eq("DL_B_UUID", ((mysql_BP_DIST_LINE)list3.get(i)).getDL_B_UUID());
                    qc = this.bp_dist_lineMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        ((mysql_BP_DIST_LINE)list3.get(i)).setID(SecretUtil.uuid());
                        this.bp_dist_lineMapper.insert(list3.get(i));
                        this.log.info("库插入 BP_DIST_LINE表:" + list3.get(i));
                    } else {
                        this.log.info("BP_DIST_LINE表4插入过了");
                    }
                }

                for(i = 0; i < list4.size(); ++i) {
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("OCI_UUID", ((mysql_BP_ORDER_CIG_INFO)list4.get(i)).getOCI_UUID());
                    queryWrapper.eq("OCI_CIG_BRAND", ((mysql_BP_ORDER_CIG_INFO)list4.get(i)).getOCI_CIG_BRAND());
                    qc = this.bp_order_cig_infoMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        ((mysql_BP_ORDER_CIG_INFO)list4.get(i)).setID(SecretUtil.uuid());
                        this.bp_order_cig_infoMapper.insert(list4.get(i));
                        this.log.info("库插入 BP_ORDER_CIG_INFO表:" + list4.get(i));
                    } else {
                        this.log.info("BP_ORDER_CIG_INFO表4插入过了");
                    }
                }

                for(i = 0; i < list5.size(); ++i) {
                    queryWrapper = new QueryWrapper();
                    queryWrapper.eq("OI_ID", ((mysql_BP_ORDER_INFO)list5.get(i)).getOI_ID());
                    queryWrapper.eq("OI_UUID", ((mysql_BP_ORDER_INFO)list5.get(i)).getOI_UUID());
                    qc = this.bp_order_infoMapper.selectList(queryWrapper);
                    if (qc.size() == 0) {
                        ((mysql_BP_ORDER_INFO)list5.get(i)).setID(SecretUtil.uuid());
                        this.bp_order_infoMapper.insert(list5.get(i));
                        this.log.info("库插入 BP_ORDER_INFO表:" + list5.get(i));
                    } else {
                        this.log.info("BP_ORDER_INFO表4插入过了");
                    }
                }
            } catch (Exception var12) {
                System.out.println(var12);
            }

        } finally {
            ;
        }
    }

    @Bean
    public TaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(8);
        return scheduler;
    }
}

