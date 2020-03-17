package com.example.im_test.http;


import com.example.im_test.entity.BaodanBean;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * @author Created by stone
 * @since 2018/7/10
 * 目前只给app设置，用来区分baseurl
 */

public interface APIService {
    @Headers({"name:super"})
    @POST("ssw/rest/eventupper/createEvent")
    Observable<HttpResult<String>> createEvent(@Body RequestBody params);
    @Headers({"name:super"})
    @POST("ssw/rest/eventupper/searchBy")
    Observable<HttpResult<List<BaodanBean>>> seachBao(@Body RequestBody params);
//
//    /**
//     * 发送验证码
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("settingInterfaces/v1.0/sendAliCodeV2")
//    Observable<HttpResult<String>> sendCode(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 验证用户输入的验证码是否正确
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("settingInterfaces/v1.0/verCode")
//    Observable<HttpResult<String>> verifyVerificationCode(@FieldMap Map<String, String> params);
//
//
//
//    /**
//     * 投诉申请
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("merchantsInterfaces/v1.0/insertMemberComplaints")
//    Observable<HttpResult<String>> Complain(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 获取首页消息类型
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/getMemberMsgsType")
//    Observable<HttpResult<List<MessageType>>> getMessageTypes(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取众筹消息类型
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/getMemberMsgsTypeV2")
//    Observable<HttpResult<List<MessageType>>> getRaiseMessageTypes(@FieldMap Map<String, String> params);
//
//    /**
//     * 消息列表
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/getMemberMsgs")
//    Observable<HttpResult<List<MsgBean>>> MemberMsgs(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取圈子未读消息数
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/getMemberMsgCircle")
//    Observable<HttpResult<MsgBean>> getCircleUnreadMsg(@FieldMap Map<String, String> params);
//
//    /**
//     * 用户删除单条消息
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/deleteMemberMsg")
//    Observable<HttpResult<String>> memberDeleteSingleMsg(@FieldMap Map<String, String> params);
//
//    /**
//     * 一键阅读用户所有未读消息
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/readMsgs")
//    Observable<HttpResult<String>> readMemberAllMessage(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 活动列表-搜索
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/searchGagActivity")
//    Observable<HttpResult<List<SeachTag>>> SeachCircles(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 活动列表-搜索
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/searchGagActivity")
//    Observable<HttpResult<List<SeachUser>>> Seachuser(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 圈子-获取我关注的活动（视频）列表
//     *
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/searchGZActivityList")
//    Observable<HttpResult<List<OtherUser>>> getMyFollowCircles(@FieldMap Map<String, String> params);
//
//    /**
//     * 收藏活动
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/insertQZCollection")
//    Observable<HttpResult<String>> focusCircle(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 登录
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/loginMember")
//    Observable<HttpResult<UserDetailBean>> login(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 入驻商家-问题列表
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getMerchantsTitles")
//    Observable<HttpResult<List<RZQuestion>>> getQuestion(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 注册用-个人信息
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/getMemberDetail")
//    Observable<HttpResult<UserDetailBean>> userInfo(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 忘记密码-重置
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/forgetPassword")
//    Observable<HttpResult<String>> resetPwd(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 修改绑定手机
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/updateMemberDetailV2")
//    Observable<HttpResult<String>> updatePhone(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 微信登录
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/wxAppLoginMember")
//    Observable<HttpResult<UserDetailBean>> wxlogin(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 微博登录
//     *
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/weiboAppLoginMember")
//    Observable<HttpResult<UserDetailBean>> wbLogin(@Field("weibo_open_id") String open_id);
//
//    /**
//     * QQ登录
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/qqAppLoginMember")
//    Observable<HttpResult<UserDetailBean>> QQlogin(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 微信登录
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/wxAppBindMobile")
//    Observable<HttpResult<BindThirdBean>> bundleWx(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 微信登录
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/qqAppBindMobile")
//    Observable<HttpResult<BindThirdBean>> bundleQQ(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 微信登录
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/weiboAppBindMobile")
//    Observable<HttpResult<BindThirdBean>> bundleWb(@FieldMap Map<String, String> parmer);
//
//
//    /**
//     * 添加地址
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("addressInterfaces/v1.0/insertAddress")
//    Observable<HttpResult<String>> add_addrees(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 地址列表
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("addressInterfaces/v1.0/getMemberAddress")
//    Observable<HttpResult<List<AddressBean>>> addrees_list(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 地址详情
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("addressInterfaces/v1.0/getAddressDetail")
//    Observable<HttpResult<AddressBean>> addrees_detail(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 修改默认地址
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("addressInterfaces/v1.0/updateDefaultAddress")
//    Observable<HttpResult<String>> addrees_default_update(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 默认地址
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("addressInterfaces/v1.0/getDefaultAddress")
//    Observable<HttpResult<AddressBean>> addrees_default(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 删除地址
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("addressInterfaces/v1.0/deleteAddress")
//    Observable<HttpResult<String>> addrees_delete(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 地址修改
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("addressInterfaces/v1.0/updateAddress")
//    Observable<HttpResult<String>> addrees_update(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 获取集市页面商品列表
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("goodsInterfaces/v1.0/getGoodss")
//    Observable<HttpResult<List<MarketData>>> getMarketGoodsData(@FieldMap Map<String, String> params);
//
//    /**
//     * 个人认证
//     *
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/insertMemberCertification")
//    Observable<HttpResult<String>> personalRz(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 【集市推荐或上新商品】
//     * 获取集市商品包含筛选条件
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("goodsInterfaces/v1.0/getGoodsMarketings")
//    Observable<HttpResult<List<MarketData>>> getGoodsMarketings(@FieldMap Map<String, String> params);
//
//    /**
//     * 获得html
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getSheepHtml")
//    Observable<HttpResult<String>> getHtml(@FieldMap Map<String, String> params);
//
//    /**
//     * 用户收藏
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/insertMemberCollection")
//    Observable<HttpResult<String>> Follow(@FieldMap Map<String, String> params);
//
//    /**
//     * 商品分类
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("goodsInterfaces/v1.0/getGoodsClasss")
//    Observable<HttpResult<List<ClassBean>>> getGoodsclass(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取集市商品详情数据
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("goodsInterfaces/v1.0/getGoodsDetail")
//    Observable<HttpResult<GoodsDetail>> getGoodsDetailData(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取农耕商品详情数据
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("goodsInterfaces/v1.0/getGoodsDetailV2")
//    Observable<HttpResult<GoodsDetail>> getFarmingGoodsDetailData(@FieldMap Map<String, String> params);
//
//    /**
//     * 核销农耕订单二维码
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/applyOrder")
//    Observable<HttpResult<String>> useFarmingOrder(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取集市商品订单播报数据
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("goodsInterfaces/v1.0/getOrderBroadcast")
//    Observable<HttpResult<List<OrderBroadcastEntity>>> getOrderBroadcast(@Field("goods_id") String goods_id);
//
//    /**
//     * 生成小程序二维码
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getWXACodeUnlimit")
//    Observable<HttpResult<String>> getGoodsQZ_code(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 领取集市优惠卷
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/insertMemberShopCoupon")
//    Observable<HttpResult<String>> receiveMarketCoupon(@FieldMap Map<String, String> params);
//
//    /**
//     * 领取认养商品优惠卷
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/insertMemberCoupon")
//    Observable<HttpResult<String>> receiveSheepCoupon(@FieldMap Map<String, String> params);
//
//    /**
//     * 获得商品规格详情数据
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("goodsInterfaces/v1.0/getGoodsSpecificationDetail")
//    Observable<HttpResult<GoodsSpecificationDetail>> getSpecificationDetailData(@Field("goods_id") int goods_id, @Field("specification_ids") String specification_ids, @Field("member_id") String member_id);
//
//    /**
//     * 获得认养、合养商品规格详情数据
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getGoodsSpecificationDetail")
//    Observable<HttpResult<GoodsSpecificationDetail>> getSheepSpecificationDetailData(@Field("bitch_sheep_id") String bitch_sheep_id, @Field("specification_ids") String specification_ids);
//
//    /**
//     * 获得商品规格详情数据
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("goodsInterfaces/v1.0/getGoodsSpecificationDetail")
//    Observable<HttpResult<SpellSpecificationDetail>> getSpellSpecificationDetailData(@Field("goods_id") String bitch_sheep_id, @Field("specification_ids") String specification_ids);
//
//    /**
//     * 添加商品到购物车
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("shopCarInterfaces/v1.0/insertShopCar")
//    Observable<HttpResult<String>> addGoodsToShopCart(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取购物车列表
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("shopCarInterfaces/v1.0/getShopCars")
//    Observable<HttpResult<List<ShopCartList>>> getShopCartListData(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取购物车失效商品列表
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("shopCarInterfaces/v1.0/getShopCarsV2")
//    Observable<HttpResult<List<ShopCartList>>> getShopCartFailureListData(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取用户购物车数量
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("shopCarInterfaces/v1.0/getMemberShopCarSum")
//    Observable<HttpResult<Integer>> getShopCartNumber(@FieldMap Map<String, String> params);
//
//    /**
//     * 修改购物车中的商品
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("shopCarInterfaces/v1.0/updateShopCar")
//    Observable<HttpResult<Object>> changeShopCartGoods(@FieldMap Map<String, String> params);
//
//    /**
//     * 修改购物车中商品的规格
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("shopCarInterfaces/v1.0/updateShopCarV2")
//    Observable<HttpResult<String>> changeCartGoodsSpecific(@FieldMap Map<String, String> params);
//
//    /**
//     * 删除购物车中的商品
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("shopCarInterfaces/v1.0/deleteShopCars")
//    Observable<HttpResult<Object>> deleteShopCartGoods(@FieldMap Map<String, String> params);
//
//    /**
//     * 他人作品
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/getItActivity")
//    Observable<HttpResult<List<OtherUser>>> herWorks(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 删除作品
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/delActivity")
//    Observable<HttpResult<String>> deleteWorks(@FieldMap Map<String, String> parmer);
//
//
//    /**
//     * 我的作品
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/getMyActivity")
//    Observable<HttpResult<List<OtherUser>>> mineWorks(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 集市订单列表
//     *
//     * @param params 参数
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/getOrders")
//    Observable<HttpResult<List<OrderBean>>> getBazaarOrderList(@FieldMap Map<String, String> params);
//
//    /**
//     * 拼团订单列表
//     *
//     * @param params 参数
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/getOrdersV2")
//    Observable<HttpResult<List<SpellOrder>>> getBazaarOrder(@FieldMap Map<String, String> params);
//
//    /**
//     * 商品拼团列表
//     *
//     * @param params 参数
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/getGroups")
//    Observable<HttpResult<List<Spells>>> spellGroups(@FieldMap Map<String, String> params);
//
//    /**
//     * 认养订单列表
//     *
//     * @param params 参数
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepOrderInterfaces/v1.0/getOrders")
//    Observable<HttpResult<List<SheepOrder>>> getFosterOrderList(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 订单详情-待付款
//     *
//     * @param params 参数
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/getOrderDetail")
//    Observable<HttpResult<OrderGoodsBean>> getOrderDetaild(@FieldMap Map<String, String> params);
//
//    /**
//     * 取消订单-待付款
//     *
//     * @param params 参数
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/cancelOrder")
//    Observable<HttpResult<String>> CancelnotPayOrder(@FieldMap Map<String, String> params);
//
//    /**
//     * 余额支付-羊
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepOrderInterfaces/v1.0/balancePay")
//    Observable<HttpResult<BalancePayment>> yu_epay_y(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 真支付-wx羊
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepOrderInterfaces/v1.0/payRealOrder")
//    Observable<HttpResult<WxPayMode>> OrderpayWX_y(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 真支付
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/payRealOrder")
//    Observable<HttpResult<String>> Orderpay(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 余额支付
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/payBalanceOrder")
//    Observable<HttpResult<String>> yu_epay(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 真实
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/payBalanceOrderV2")
//    Observable<HttpResult<String>> spell_yu_pay(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 礼品街余额支付接口
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("shopGivingInterfaces/v1.0/payBalanceOrder")
//    Observable<HttpResult<String>> giftStreetBalancePay(@FieldMap Map<String, String> params);
//
//    /**
//     * 评团时
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/getOrderGroupDetail")
//    Observable<HttpResult<OrderGroup>> OrderGroup(@FieldMap Map<String, String> parmer);
//
//
//    /**
//     * 真支付-微信
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/payRealOrder")
//    Observable<HttpResult<WxPayMode>> OrderpayWX(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 评价订单
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/assessmentOrderV2")
//    Observable<HttpResult<String>> evaluation(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 评价订单-羊订单
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepOrderInterfaces/v1.0/assessOrder")
//    Observable<HttpResult<String>> evaluation_y(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 取消订单-待发货
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/cancelPayOrderMerchants")
//    Observable<HttpResult<String>> OrderCancel_j(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 删除订单-取消-待付款
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/deleteOrderCancelWaitPay")
//    Observable<HttpResult<String>> Orderdelete_j(@FieldMap Map<String, String> parmer);
//
//
//    /**
//     * 提现
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/insertMemberWithdrawal")
//    Observable<HttpResult<String>> MemberWithdrawal(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 银行列表
//     * 返利订单详情
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getMemberOrderSheepDetail")
//    Observable<HttpResult<String>> getMemberOrderSheepDetail(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 银行列表
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/getBanks")
//    Observable<HttpResult<List<Banks>>> getBanks(@FieldMap Map<String, String> parmer);
//
//
//    /**
//     * 银行卡列表
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/getBankCards")
//    Observable<HttpResult<List<MineBanks>>> getBankCards(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 银行卡列表
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getMemberWithdrawalDetail")
//    Observable<HttpResult<WithDetail>> WithdrawalDetail(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 解绑银行卡
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("/memberInterfaces/v1.0/deleteBankCard")
//    Observable<HttpResult<String>> deleteBankCard(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 绑定银行卡
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/insertBankCard")
//    Observable<HttpResult<String>> insertBankCard(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 删除订单-关闭状态
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/deleteOrderClose")
//    Observable<HttpResult<String>> OrderdeleteClose_j(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 确认收货
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/receiveOrder")
//    Observable<HttpResult<String>> Confirm_ok(@FieldMap Map<String, String> parmer);
//
//
//    /**
//     * 添加发票
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("invoiceInterfaces/v1.0/insertInvoice")
//    Observable<HttpResult<String>> addInvoice(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 修改发票
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("invoiceInterfaces/v1.0/insertInvoice")
//    Observable<HttpResult<String>> updateInvoice(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 发票详情
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("invoiceInterfaces/v1.0/getInvoiceDetail")
//    Observable<HttpResult<InvoiceBean>> InvoiceDetail(@FieldMap Map<String, String> parmer);
//
//
//    /**
//     * 他人详情
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/getMemberDetailActivityV2")
//    Observable<HttpResult<HerBean>> herInfo(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 他人详情
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/searchFollowList")
//    Observable<HttpResult<List<FocusBean>>> herfocus(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 他人收藏
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/getItCollActivity")
//    Observable<HttpResult<List<OtherUser>>> herCollection(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 我的收藏
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/getItCollActivity")
//    Observable<HttpResult<List<OtherUser>>> mineCollection(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 用户收藏接口，可收藏多类型数据
//     * 收藏类型 1:商家 2:集市商品 3:认养商品 4:游玩活动商品 5:众筹活动 6:视频
//     *
//     * @param params 参数
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/insertMemberCollection")
//    Observable<HttpResult<String>> insertMemberCollection(@FieldMap Map<String, String> params);
//
//    /**
//     * 修改个人信息
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/updateMemberDetail")
//    Observable<HttpResult<String>> UpdateInfo(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 个人详情
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getMemberDetail")
//    Observable<HttpResult<UserDetailBean>> getUserInfo(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 集市商品下单
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/insertOrder")
//    Observable<HttpResult<orderPay>> place_order(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 认养、合养商品下单
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepOrderInterfaces/v1.0/insertOrderV2")
//    Observable<HttpResult<SheepPlaceOrderResult>> sheepPlaceOrder(@FieldMap Map<String, String> params);
//
//    /**
//     * 认养、合养商品下单
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("farmingInterfaces/v1.0/getMerchantss")
//    Observable<HttpResult<List<farmBean>>> getNearFarm(@FieldMap Map<String, String> params);
//
//    /**
//     * 取消申请退款
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/cancelRefundOrder")
//    Observable<HttpResult<String>> getcancel_refund(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 羊商品模拟支付
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepOrderInterfaces/v1.0/PayOrder")
//    Observable<HttpResult<SheepSimulationPayResult>> sheepSimulationPay(@FieldMap Map<String, String> params);
//
//    /**
//     * 订单详情(已支付订单)
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/getOrderMerchantsDetail")
//    Observable<HttpResult<OrderDetail>> orderdetail(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 订单详情(已支付订单)
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/getOrderMerchantsDetail")
//    Observable<HttpResult<SpellOrderDetail>> SpellDetail(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 认养商品确认收货
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepOrderInterfaces/v1.0/receiveOrder")
//    Observable<HttpResult<String>> sheepGoodsConfirmReceiver(@FieldMap Map<String, String> params);
//
//    /**
//     * 羊订单详情
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepOrderInterfaces/v1.0/getOrderDetail")
//    Observable<HttpResult<SheepOrder>> sheepOrderdetail(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 羊订单-取消订单
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepOrderInterfaces/v1.0/cancelOrder")
//    Observable<HttpResult<String>> cancelOrder_y(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 羊订单-删除订单
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepOrderInterfaces/v1.0/deleteOrder")
//    Observable<HttpResult<String>> deleteOrder_y(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 羊订单-ali
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepOrderInterfaces/v1.0/payRealOrder")
//    Observable<HttpResult<String>> pay_Order_y(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 获取新手福利数据
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @POST("sheepMemberInterfaces/v1.0/getWelfareDetail")
//    Observable<HttpResult<NewBieBenefits>> getNewBieBenefitsData();
//
//    /**
//     * 收藏列表
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getMemberCollections")
//    Observable<HttpResult<List<CollectBean>>> getCollectData(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 优惠券列表
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/deleteMemberCoupon")
//    Observable<HttpResult<String>> deleteCoupons(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 一键领取新手福利优惠券
//     *
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getAllWelfare")
//    Observable<HttpResult<String>> receiverNewBieCoupons(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取关注的用户列表
//     *
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/searchFollowList")
//    Observable<HttpResult<List<FollowUserList>>> getFollowUserList(@FieldMap Map<String, String> params);
//
//    /**
//     * 圈子-关注用户
//     *
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/activityFollow")
//    Observable<HttpResult<String>> circleFollowUser(@FieldMap Map<String, String> params);
//
//    /**
//     * 圈子-关注用户
//     *
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/activityZan")
//    Observable<HttpResult<String>> activityZan(@FieldMap Map<String, String> params);
//
//    /**
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("farmingInterfaces/v1.0/searchFarmingTopic")
//    Observable<HttpResult<List<framingBean>>> getframings(@FieldMap Map<String, String> params);
//
//    /**
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("farmingInterfaces/v1.0/getTopicDetail")
//    Observable<HttpResult<framDeatil>> getframingsDeatil(@FieldMap Map<String, String> params);
//
//    /**
//     * 商家视频、直播-分类栏目列表
//     *
//     * @param merchants_id 商家id
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getVideoClass")
//    Observable<HttpResult<List<FarmClass>>> getFarmClass(@Field("merchants_id") String merchants_id);
//
//    /**
//     * 商家直播
//     *
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getVideos")
//    Observable<HttpResult<List<framlive>>> framlive(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 圈子-点赞记录
//     *
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/searchActivityZan")
//    Observable<HttpResult<List<ZanBean>>> circleZan(@FieldMap Map<String, String> params);
//
//    /**
//     * 圈子-关注用户
//     *
//     * @param
//     * @return 数据
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/searchTagList")
//    Observable<HttpResult<List<TagBean>>> get_tag(@FieldMap Map<String, String> params);
//
//    /**
//     * 圈子-获取视频评论数据
//     *
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/getActivityCommentList")
//    Observable<HttpResult<List<VideoCommentsList>>> getVideoCommentsList(@FieldMap Map<String, String> params);
//
//    /**
//     * 圈子-视频发布评论
//     * type = 1 发布评论到视频
//     * type = 2 发布评论到评论
//     *
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/insertActivityComment")
//    Observable<HttpResult<String>> circleInsertComment(@FieldMap Map<String, String> params);
//
//    /**
//     * 评价众筹
//     *
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/insertChipsComments")
//    Observable<HttpResult<String>> insertChipsComments(@FieldMap Map<String, String> params);
//
//    /**
//     * 众筹评价列表
//     *
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/getChipsComments")
//    Observable<HttpResult<List<RaiseComment>>> getChipsComments(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 圈子-给视频中的评论点赞
//     *
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/activityCommentZan")
//    Observable<HttpResult<String>> circleCommentPraise(@FieldMap Map<String, String> params);
//
//    /**
//     * 众筹-评论点赞
//     *
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/insertChipsCommentsZan")
//    Observable<HttpResult<String>> insertChipsCommentsZan(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 圈子-发布视频、图文
//     *
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:circle"})
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/insertQZActivity")
//    Observable<HttpResult<String>> circleReleasedVideoOrImgTxt(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取商家店铺详情数据
//     *
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getMerchantsDetail")
//    Observable<HttpResult<GoodsDetail.MerchantsBean>> getStoreDetailData(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取用户所有优惠券
//     *
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getMemberCoupons")
//    Observable<HttpResult<List<couponsBean>>> getCoupons(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取集市店铺中的优惠券数据
//     *
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/getCoupons")
//    Observable<HttpResult<List<GoodsDetail.SheepCouponBeans>>> getStoreCoupons(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取用户所有优惠券
//     *
//     * @param params 参数
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getMemberNotCoupons")
//    Observable<HttpResult<List<couponsBean>>> getNoCoupons(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 获取团购详情数据（合养详情页面）
//     *
//     * @param sheep_group_id 团购id
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getSheepGroupDetail")
//    Observable<HttpResult<MultiFosterDetail>> getMultiFosterDetailData(@Field("sheep_group_id") String sheep_group_id);
//
//    /**
//     * 获取我的仓库数据列表
//     *
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("/sheepInterfaces/v1.0/getMemberWarehouses")
//    Observable<HttpResult<List<WarehouseList>>> getWarehouseListData(@FieldMap Map<String, String> params);
//
//    /**
//     * 拼团下单
//     *
//     * @return 数据
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("/orderInterfaces/v1.0/insertOrderV2")
//    Observable<HttpResult<SpellInsert>> SpellInsert(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 根据member_sheep_id获取仓库详情数据
//     *
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getMemberWarehouseDetail")
//    Observable<HttpResult<WarehouseDetail>> getWarehouseDetailData(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取仓库详情记录数据
//     *
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getMemberWarehouseDetailV2")
//    Observable<HttpResult<List<WarehouseDetailRecord>>> getWarehouseDetailRecordData(@FieldMap Map<String, String> params);
//
//    /**
//     * 对仓库详情记录进行插入操作
//     * 采摘、配送
//     *
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/insertMemberWarehouse")
//    Observable<HttpResult<String>> insertWarehouseRecord(@FieldMap Map<String, String> params);
//
//    /**
//     * 对仓库详情记录进行删除操作
//     * 取消采摘、取消赠礼
//     *
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/deleteMemberWarehouse")
//    Observable<HttpResult<String>> deleteWarehouseRecord(@FieldMap Map<String, String> params);
//
//    /**
//     * 对仓库详情记录进行修改操作
//     * 修改收货地址
//     *
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepOrderInterfaces/v1.0/updateOrderAddress")
//    Observable<HttpResult<String>> changeShippingAddress(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取赠礼主题图片数据
//     *
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @GET("sheepInterfaces/v1.0/getThemes")
//    Observable<HttpResult<List<GivingGiftTheme>>> getGivingGiftThemeData();
//
//    /**
//     * 赠送给好友
//     * 必传
//     * order_id	string	是	订单ID
//     * gift_img	string	是	主题照片
//     * sheep_img	string	是	商品图片
//     * sheep_name	string	是	商品名称
//     * gift_desc	string	是	祝福语
//     * gift_voice	string	是	祝福语音
//     * gift_url	string	是	祝福视频
//     *
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/insertMemberGift")
//    Observable<HttpResult<String>> warehouseGivingToFriends(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取App常见问题数据
//     *
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @GET("sheepInterfaces/v1.0/getQuestions")
//    Observable<HttpResult<List<CommonProblemsData>>> loadCommonProblemsData();
//
//    /**
//     * 个人认证详情
//     *
//     * @return 数据
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/getMemberCertificationDetail")
//    Observable<HttpResult<MemberRZ>> getMemberRZ(@FieldMap Map<String, String> params);
//
//    /**
//     * 企业认证
//     *
//     * @return 数据
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/insertEnterpriseCertification")
//    Observable<HttpResult<String>> insertEnterprise(@FieldMap Map<String, String> params);
//
//    /**
//     * 修改企业认证
//     *
//     * @return 数据
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/updateEnterpriseCertification")
//    Observable<HttpResult<String>> updateEnterprise(@FieldMap Map<String, String> params);
//
//    /**
//     * 申请退款_集市
//     *
//     * @param
//     * @return 数据
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/refundOrder")
//    Observable<HttpResult<String>> refund_js(@FieldMap Map<String, String> params);
//
//    /**
//     * 申请退款_认养
//     *
//     * @param
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepOrderInterfaces/v1.0/refundOrder")
//    Observable<HttpResult<String>> sheepOrderRefund(@FieldMap Map<String, String> params);
//
//    /**
//     * 申请退款_集市
//     *
//     * @param
//     * @return 数据
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/getRefundOrderDetail")
//    Observable<HttpResult<RefundDetail>> refund_update_detail(@FieldMap Map<String, String> params);
//
//    /**
//     * 申请退款_集市
//     *
//     * @param
//     * @return 数据
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/updateOrderRefund")
//    Observable<HttpResult<String>> refund_update(@FieldMap Map<String, String> params);
//
//    /**
//     * 撤销投诉
//     *
//     * @param
//     * @return 数据
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("merchantsInterfaces/v1.0/deleteMemberComplaints")
//    Observable<HttpResult<String>> Cancel_complaint(@FieldMap Map<String, String> params);
//
//    /**
//     * 退款填写物流单号
//     *
//     * @param
//     * @return 数据
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/updateOrderRefundV2")
//    Observable<HttpResult<String>> inputLogisticsOn(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 申请退款_集市_原因列表
//     *
//     * @param
//     * @return 数据
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/getOrderRefundReasons")
//    Observable<HttpResult<List<WhyBean>>> refund_js_why(@FieldMap Map<String, String> params);
//
//    /**
//     * 申请退款_集市_原因列表
//     *
//     * @param
//     * @return 数据
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/getRefundOrders")
//    Observable<HttpResult<List<RefunedBean>>> refund_list(@FieldMap Map<String, String> params);
//
//    /**
//     * 申请退款—详情
//     *
//     * @param
//     * @return 数据
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/getOrderRefundRecords")
//    Observable<HttpResult<List<baseBean>>> refund_detail(@FieldMap Map<String, String> params);
//
//    /**
//     * 商家入驻申请
//     *
//     * @param
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/insertMemberMerchants")
//    Observable<HttpResult<String>> tenants(@FieldMap Map<String, String> params);
//
//    /**
//     * 商家入驻详情
//     *
//     * @param
//     * @return 数据
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getMemberMerchantsDetail")
//    Observable<HttpResult<RzDeatil>> rzDeatil(@FieldMap Map<String, String> params);
//
//    /**
//     * 评价列表-集市
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/getOrderAssessments")
//    Observable<HttpResult<List<evaluate>>> getEvaluates(@FieldMap Map<String, String> params);
//
//    /**
//     * 集市订单-多商品评价
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/assessmentOrder")
//    Observable<HttpResult<String>> insertEvaluates(@FieldMap Map<String, String> params);
//
//    /**
//     * 评价列表-羊商品（认养、合养）
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepOrderInterfaces/v1.0/getSheepAssessments")
//    Observable<HttpResult<List<evaluate>>> getSheepGoodsCommentData(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取我的评价列表数据
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("/sheepMemberInterfaces/v1.0/getMemberAssesss")
//    Observable<HttpResult<List<evaluate>>> getMyCommentData(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取农场视频列表数据
//     *
//     * @return listData
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("/sheepInterfaces/v1.0/getMerchantss")
//    Observable<HttpResult<List<FarmVideoList>>> getFarmVideoList(@Field("page") String page);
//
//    /**
//     * 用户收支明细
//     *
//     * @return listData
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("/sheepInterfaces/v1.0/getMemberRebates")
//    Observable<HttpResult<List<balanceDetail>>> getMemberRebates(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取集市订单物流数据
//     *
//     * @return data
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/getOrderLogisticsDetails")
//    Observable<HttpResult<OrderLogisticsData>> getOrderLogisticsData(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取认养订单物流数据
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepOrderInterfaces/v1.0/getOrderLogistic")
//    Observable<HttpResult<OrderLogisticsData>> getSheepLogisticsData(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取福利数据
//     *
//     * @param coupon_img_type 1:新手福利 2:老用户福利 3:仓库图片 4:新人专享
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getCouponImgDetail")
//    Observable<HttpResult<WelfareEntity>> getWelfareData(@Field("coupon_img_type") String coupon_img_type);
//
//    /**
//     * 获取启动页广告数据
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @GET("sheepInterfaces/v1.0/getCouponImgDetailV2")
//    Observable<HttpResult<WelfareEntity>> getWelcomeAdData();
//
//    /**
//     * 获取预定新菜列表数据
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getNewBitchSheeps")
//    Observable<HttpResult<List<GoodsSpecificationDetail>>> getReservationNewFoodData(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取城市列表数据
//     *
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("addressInterfaces/v1.0/getCitys")
//    Observable<HttpResult<List<CityBean>>> getCity(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取热门搜索关键字数据
//     *
//     * @param hot_type 1:集市热门关键字 2:农耕热门关键字 3:认养热门关键字
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getHotSearchs")
//    Observable<HttpResult<List<SearchKeyWord>>> getSearchKeywordData(@Field("hot_type") String hot_type);
//
//    /**
//     * 获取热门搜索默认字数据
//     *
//     * @param hot_type 1:集市默认关键字 2:农耕默认关键字 3:认养默认关键字。4:资讯默认关键字 5:圈子默认关键字
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getDefaultSearchs")
//    Observable<HttpResult<List<SearchDefaultWord>>> getDefaultSearchs(@Field("default_type") String hot_type);
//
//    /**
//     * 提交意见反馈
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/insertAdvice")
//    Observable<HttpResult<String>> commitFeedback(@FieldMap Map<String, String> params);
//
//    /**
//     * 用户举报
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/insertMemberReport")
//    Observable<HttpResult<String>> userReport(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取意见反馈类型数据
//     *
//     * @return
//     */
//    @Headers({"name:member"})
//    @GET("memberInterfaces/v1.0/getAdviceTypes")
//    Observable<HttpResult<List<FeedbackType>>> getFeedbackTypes();
//
//    /**
//     * 获得邀请有礼页面数据
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getMemberInvitation")
//    Observable<HttpResult<InvitationPoliteData>> getInvitationPoliteData(@FieldMap Map<String, String> params);
//
//    /**
//     * 获得邀请人、奖励数据
//     *
//     * @return
//     */
//    @Headers({"name:member"})
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/getMemberSubordinate")
//    Observable<HttpResult<List<InviteRewardsData>>> getInviteRewardsData(@FieldMap Map<String, String> params);
//
//    /**
//     * 获得分享内容数据接口
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getMemberShares")
//    Observable<HttpResult<List<ShareInfoData>>> getShareInfoData(@Field("type_id") String type_id);
//
//
//    //========================华丽的分割线===================
//
//    /**
//     * 羊只咬死分享成功后奖励物品
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepLiteMemberInterfaces/v1.0/giveMemberReward")
//    Observable<HttpResult<String>> getGiveMemberReward(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 游戏商品
//     *
//     * @return
//     */
//    @Headers({"name:game"})
//    @POST("sheepLiteMemberInterfaces/v1.0/getGameGifts")
//    Observable<HttpResult<List<GameGiftsBean>>> getGameGifts();
//
//
//    /**
//     * 开始养殖
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepLiteMemberInterfaces/v1.0/startMemberSheep")
//    Observable<HttpResult<StartMemberSheepBean>> getStartMemberSheep(@FieldMap Map<String, String> params);
//
//    /**
//     * 收取金币、经验
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepLiteMemberInterfaces/v1.0/takeMemberFinish")
//    Observable<HttpResult<TakeMemberFinish>> getTakeMemberFinish(@FieldMap Map<String, String> params);
//
//    /**
//     * 游戏主页
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getMemberDetail")
//    Observable<HttpResult<GameMemberDetail>> getMemberDetail(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 草
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepLiteMemberInterfaces/v1.0/getGameMemberBushes")
//    Observable<HttpResult<List<GameMemberBushesBean>>> getGameMemberBushes(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 收取
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepLiteMemberInterfaces/v1.0/getBushes")
//    Observable<HttpResult<String>> getBushes(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 好友主页
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getFriendDetail")
//    Observable<HttpResult<GameMemberDetail>> getFriendDetail(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 放狼
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepLiteMemberInterfaces/v1.0/putTheWolf")
//    Observable<HttpResult<PutTheWolfBean>> getPutTheWolf(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 能量球
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepLiteMemberInterfaces/v1.0/getMemberFinishes")
//    Observable<HttpResult<List<MemberFinishes>>> getMemberFinishes(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 干狼
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepLiteMemberInterfaces/v1.0/playTheWolf")
//    Observable<HttpResult<String>> getPlayTheWolf(@FieldMap Map<String, String> params);
//
//    /**
//     * 判断羊是否死亡
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getMemberSheepHp")
//    Observable<HttpResult<String>> getMemberSheepHp(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 游戏好友列表
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getMemberFriends")
//    Observable<HttpResult<List<GameFriends>>> getMemberFriends(@FieldMap Map<String, String> params);
//
//    /**
//     * 天气预报
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getWeather")
//    Observable<HttpResult<String>> getWeather(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 攻略
//     *
//     * @return
//     */
//    @Headers({"name:game"})
//    @POST("sheepLiteMemberInterfaces/v1.0/getManuals")
//    Observable<HttpResult<List<ManualsBean>>> getManuals();
//
//    /**
//     * 领养，保存地址
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepLiteMemberInterfaces/v1.0/insertOrderAddress")
//    Observable<HttpResult<String>> getInsertOrderAddress(@FieldMap Map<String, String> params);
//
//    /**
//     * 引导界面不显示调用
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/updateMemberGameGuide")
//    Observable<HttpResult<String>> getupdateMemberGameGuide(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 游戏任务
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getGameTasks")
//    Observable<HttpResult<List<GameTasks>>> getGameTasks(@FieldMap Map<String, String> params);
//
//    /**
//     * 好友动态
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getGameStealList")
//    Observable<HttpResult<List<GameStealList>>> getGameStealList(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 复活羊
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepLiteMemberInterfaces/v1.0/sheepResurrection")
//    Observable<HttpResult<String>> sheepLiteMemberInterfaces(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 农场动态
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getGameDynamic")
//    Observable<HttpResult<List<GameDynamic>>> getGameDynamic(@FieldMap Map<String, String> params);
//
//    /**
//     * 附近好友
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getStrangeMembers")
//    Observable<HttpResult<List<StrangeMembers>>> getStrangeMembers(@FieldMap Map<String, String> params);
//
//    /**
//     * 好友申请列表
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getMemberFriendInvations")
//    Observable<HttpResult<List<MemberFriendInvations>>> getMemberFriendInvations(@FieldMap Map<String, String> params);
//
//    /**
//     * 加好友
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/insertFriend")
//    Observable<HttpResult<String>> getInsertFriend(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 拒绝
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/refuseFriend")
//    Observable<HttpResult<String>> getRefuseFriend(@FieldMap Map<String, String> params);
//
//    /**
//     * 同意
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/agreeFriend")
//    Observable<HttpResult<String>> getAgreeFriend(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 视频列表
//     *
//     * @return
//     */
//    @Headers({"name:game"})
//    @POST("sheepLiteMemberInterfaces/v1.0/getGameVideos")
//    Observable<HttpResult<List<GameVideos>>> getGameVideos();
//
//    /**
//     * 道具商城-背景
//     *
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getGameGoodss")
//    Observable<HttpResult<List<GameGoodss>>> getGameGoodss(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 衣服佩戴
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/useGameImg")
//    Observable<HttpResult<String>> getUseGameImg(@FieldMap Map<String, String> params);
//
//    /**
//     * 衣服停用
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/unUseGameImg")
//    Observable<HttpResult<String>> getUnUseGameImg(@FieldMap Map<String, String> params);
//
//    /**
//     * 衣服购买
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/insertGameMemberGoods")
//    Observable<HttpResult<String>> getInsertGameMemberGoods(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 购买食料下单
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepOrderInterfaces/v1.0/insertGameOrder")
//    Observable<HttpResult<InsertGameOrder>> getinsertGameOrder(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 使用饲料
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepLiteMemberInterfaces/v1.0/useFodder")
//    Observable<HttpResult<String>> getUseFodder(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 微信支付
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepOrderInterfaces/v1.0/wxPubPay")
//    Observable<HttpResult<WxPayMode>> getWxPubPay(@FieldMap Map<String, String> params);
//
//    /**
//     * 支付宝支付
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepOrderInterfaces/v1.0/wxPubPay")
//    Observable<HttpResult<String>> getAlipayPubPay(@FieldMap Map<String, String> params);
//
//    /**
//     * 复活、治疗
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/crueIll")
//    Observable<HttpResult<String>> getCrueIll(@FieldMap Map<String, String> params);
//
//    /**
//     * 修改昵称
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:game"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/updateGameSheep")
//    Observable<HttpResult<String>> getUpdateGameSheep(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 会员权益
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @GET("sheepMemberInterfaces/v1.0/getMemberRights")
//    Observable<HttpResult<List<MemberRights>>> getMemberRights();
//
//
//    /**
//     * 会员可提现金额资金明细
//     *
//     * @param parmer
//     * @return
//     */
////    @Headers({"name:zhangmu"})
////    @FormUrlEncoded
////    @POST("sheepInterfaces/v1.0/getMemberRebates")
////    Observable<HttpResult<List<MemberRebatesBean>>> getMemberRebates(@FieldMap Map<String, String> parmer);
////
//
//
//    /**
//     * 会员专享商品
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("goodsInterfaces/v1.0/getGoodsMembers")
//    Observable<HttpResult<List<GoodsMembers>>> getGoodsMembers(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 会员优惠券
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getCoupons")
//    Observable<HttpResult<List<MemberCouponsBean>>> getMemberCoupons(@FieldMap Map<String, String> parmer);
//
//
//    /**
//     * 素材
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getMerchantsShares")
//    Observable<HttpResult<List<MerchantsSharesBean>>> getMerchantsShares(@FieldMap Map<String, String> parmer);
//
//
//    /**
//     * 素材分享数据修改
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/updateMerchantsShare")
//    Observable<HttpResult<String>> updateMerchantsShare(@FieldMap Map<String, String> parmer);
//
//
//    /**
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/insertMemberShopCoupon")
//    Observable<HttpResult<String>> getMemberShopCoupon(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 商学院
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getInformationClass")
//    Observable<HttpResult<List<InformationsBean>>> getInformations(@FieldMap Map<String, String> parmer);
//
//
//    /**
//     * 会员首页-订单管理
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getMemberOrderSheeps")
//    Observable<HttpResult<List<MemberOrderSheeps>>> getMemberOrderSheeps(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 会员专享商品详情
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("goodsInterfaces/v1.0/getGoodsMemberDetail")
//    Observable<HttpResult<GoodsDetail>> getVIPGoodsMemberDetail(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 累计收入
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getMemberAccumulateRebate")
//    Observable<HttpResult<MemberAccumulateRebateBean>> getMemberAccumulateRebate(@FieldMap Map<String, String> parmer);
//
//
//    /**
//     * 粉丝详情
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getMemberOrderSheepsV2")
//    Observable<HttpResult<List<MemberOrderSheeps>>> getMemberOrderSheepsV2(@FieldMap Map<String, String> parmer);
//
//
//    /**
//     * 提现列表明细订单详情
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getMemberOrderSheepDetail")
//    Observable<HttpResult<MemberOrderSheeps>> getMemberMemberOrderSheepDetail(@FieldMap Map<String, String> parmer);
//
//
//    /**
//     * 获取集市商品详情数据
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getShopDetail")
//    Observable<HttpResult<CurrencyGoodsDetail>> getCurrencyShopDetail(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 集市商品下单
//     *
//     * @param parmer
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/insertExchangeShopOrder")
//    Observable<HttpResult<orderPay>> insertExchangeShopOrder(@FieldMap Map<String, String> parmer);
//
//    /**
//     * 用户收支明细
//     *
//     * @return listData
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("/sheepInterfaces/v1.0/getMemberRebates")
//    Observable<HttpResult<List<MemberRebatesBean>>> getMemberMemberRebates(@FieldMap Map<String, String> params);
//
//    //========================金币商城=====================
//
//    /**
//     * 金币收支明细列表
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getMemberCoinSources")
//    Observable<HttpResult<List<BudgetBean>>> getMemberCoinSources(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 金币商城列表
//     *
//     * @param params
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getCoupons")
//    Observable<HttpResult<List<ShopGoods>>> getCurrencyCoupons(@FieldMap Map<String, String> params);
//
//    /**
//     * 兑换详情
//     *
//     * @param requestBody
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @POST("sheepMemberInterfaces/v1.0/getCouponDetail")
//    Observable<HttpResult<CouponDetailsGoodsBean>> getCouponsDetails(@Body RequestBody requestBody);
//
//
//    /**
//     * 立即兑换
//     *
//     * @param requestBody
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @POST("sheepMemberInterfaces/v1.0/exchangeMemberCoupon")
//    Observable<HttpResult<String>> getInsertMemberCoupon(@Body RequestBody requestBody);
//
//
////    /**
////     * 社区团购模块
////     *
////     * @return
////     */
////    @Headers({"name:tg"})
////    @POST("goodsInterfaces/v1.0/getCurActivityBanners")
////    Observable<HttpResult<List<CurActivityBanners>>> getCurActivityBanners();
////
////    /**
////     * 商品类别（分类）
////     *
////     * @return
////     */
////    @Headers({"name:tg"})
////    @POST("goodsInterfaces/v1.0/getGoodsClasss")
////    Observable<HttpResult<List<GoodsClasssBean>>> getGoodsClasss();
////
////
////    /**
////     * 活动详情
////     *
////     * @return
////     */
////    @Headers({"name:tg"})
////    @FormUrlEncoded
////    @POST("goodsInterfaces/v1.0/getActivityDetail")
////    Observable<HttpResult<ActivityDetailBean>> getActivityDetail(@Field("activity_way") String activity_way);
////
////
////    /**
////     * 分类对应的 商品列表
////     *
////     * @param params
////     * @return
////     */
////    @Headers({"name:tg"})
////    @FormUrlEncoded
////    @POST("goodsInterfaces/v1.0/getCurActivityGoodss")
////    Observable<HttpResult<List<CurActivityGoodssBean>>> getCurActivityGoodss(@FieldMap Map<String, String> params);
////
////
////    /**
////     * 购物车列表
////     *
////     * @param params
////     * @return
////     */
////    @Headers({"name:tg"})
////    @FormUrlEncoded
////    @POST("carInterfaces/v1.0/getCars")
////    Observable<HttpResult<List<CarsBean>>> getCars(@FieldMap Map<String, String> params);
////
////    /**
////     * 购物车数量修改
////     *
////     * @param params
////     * @return
////     */
////    @Headers({"name:tg"})
////    @FormUrlEncoded
////    @POST("carInterfaces/v1.0/updateCarCount")
////    Observable<HttpResult<Object>> getUpdateCarCount(@FieldMap Map<String, String> params);
////
////    /**
////     * 删除购物车
////     *
////     * @param params
////     * @return
////     */
////    @Headers({"name:tg"})
////    @FormUrlEncoded
////    @POST("carInterfaces/v1.0/deleteCar")
////    Observable<HttpResult<Object>> getDeleteCar(@FieldMap Map<String, String> params);
////
////
////    /**
////     * 社区拼团-商品详情
////     *
////     * @param params
////     * @return
////     */
////    @Headers({"name:tg"})
////    @FormUrlEncoded
////    @POST("goodsInterfaces/v1.0/getGoodsDetail")
////    Observable<HttpResult<SQPTGoodsDetailBean>> getSQPTGoodsDetail(@FieldMap Map<String, String> params);
////
////    /**
////     * 社区拼团-商品规格
////     *
////     * @return
////     */
////    @Headers({"name:tg"})
////    @FormUrlEncoded
////    @POST("goodsInterfaces/v1.0/getGoodsSpecifications")
////    Observable<HttpResult<List<SQPTGoodsSpecificationsBean>>> getSQPTGoodsSpecifications(@Field("tg_goods_id") String tg_goods_id);
//
//
//    //========================华丽的结尾线===================
//
//    /**
//     * 用户点赞接口
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/insertMemberGive")
//    Observable<HttpResult<String>> insertMemberLike(@FieldMap Map<String, String> params);
//
//    /**
//     * 签到
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/signCoin")
//    Observable<HttpResult<SignBean>> signCoin(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取日签图片
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getJokeDayRecordBeans")
//    Observable<HttpResult<List<DaySignImgBean>>> getDaySignImg(@FieldMap Map<String, String> params);
//
//    /**
//     * 对签到图片进行点赞、分享
//     * day_record_id	                    string	是	日签记录id
//     * share_count	                        string	是	分享传数值(传1时表示分享操作，0相反）
//     * jokeMemberRecordBean.operate_type    string	是	赞操作类型，1点赞，0取消赞
//     * jokeMemberRecordBean.member_id	    string	是	用户id
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/updateJokeDayRecordBean")
//    Observable<HttpResult<String>> updateJokeDayRecordBean(@FieldMap Map<String, String> params);
//
//    /**
//     * 每日任务
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getGoldmallTaskBeans")
//    Observable<HttpResult<List<dailyTask>>> GoldmallTask(@FieldMap Map<String, String> params);
//
//    /**
//     * 用户详情
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getMemberDetail")
//    Observable<HttpResult<SignMember>> SignMemberDetail(@FieldMap Map<String, String> params);
//
//    /**
//     * 金币兑换优惠券
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getCoupons")
//    Observable<HttpResult<List<GoldCoupons>>> SignCoupons(@FieldMap Map<String, String> params);
//
//    /**
//     * 金币兑换优惠券
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getShopGoods")
//    Observable<HttpResult<List<GoldGoods>>> SignShopGoods(@FieldMap Map<String, String> params);
//
//    /**
//     * 设置签到提醒
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/updateSheepMember")
//    Observable<HttpResult<String>> setSignInRemind(@FieldMap Map<String, String> params);
//
//    /**
//     * 金币收支明细
//     *
//     * @return
//     */
//    @Headers({"name:zhangmu"})
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/getMemberCoinSources")
//    Observable<HttpResult<List<GoldDetailBean>>> CoinSources(@FieldMap Map<String, String> params);
//
//    /**
//     * 拼团列表
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("goodsInterfaces/v1.0/getGoodss")
//    Observable<HttpResult<List<Spell>>> Spells(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 商城比例
//     *
//     * @return
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("shopSettingInterfaces/v1.0/getPercentDetail")
//    Observable<HttpResult<PercentDetail>> getPercentDetail(@Field("percent_type") String percent_type);
//
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("shopGivingInterfaces/v1.0/getGoodss")
//    Observable<HttpResult<List<GiftStreetData>>> getGiftStreetData(@FieldMap Map<String, String> params);
//
//    @Headers("name:zhangmu")
//    @FormUrlEncoded
//    @POST("sheepInterfaces/v1.0/getMemberGiftDetail")
//    Observable<HttpResult<WarehouseGiftStreet>> getMemberGiftDetail(@FieldMap Map<String, String> params);
//
//    /**
//     * 礼品街-添加赠礼订单
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("shopGivingInterfaces/v1.0/insertGiftOrder")
//    Observable<HttpResult<orderPay>> insertGiftOrder(@FieldMap Map<String, String> params);
//
//    /**
//     * 礼品街-赠礼给好友
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("shopGivingInterfaces/v1.0/updateGiftOrder")
//    Observable<HttpResult<String>> giftStreetGivingToFriends(@FieldMap Map<String, String> params);
//
//    /**
//     * 礼品街-填写收货地址
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("shopGivingInterfaces/v1.0/insertOrderAddress")
//    Observable<HttpResult<String>> giftInsertAddress(@FieldMap Map<String, String> params);
//
//    /**
//     * 礼品街-订单详情
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("shopGivingInterfaces/v1.0/getGiftOrderDetailV2")
//    Observable<HttpResult<GiftStreetOrderDetail>> giftStreetOrderDetail(@FieldMap Map<String, String> params);
//
//    /**
//     * 礼品街收礼
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("shopGivingInterfaces/v1.0/receiveGiftOrder")
//    Observable<HttpResult<String>> giftStreetReceiveGift(@FieldMap Map<String, String> params);
//
//    /**
//     * 礼品街收礼-修改收货地址
//     *
//     * @return 数据
//     */
//    @Headers({"name:shop"})
//    @FormUrlEncoded
//    @POST("shopGivingInterfaces/v1.0/insertOrderAddress")
//    Observable<HttpResult<String>> giftChangeShippingAddress(@FieldMap Map<String, String> params);
//
//    /**
//     * 礼品街-送出的礼物列表
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/getOrders")
//    Observable<HttpResult<List<GiftOrderBean>>> getSendOutGiftData(@FieldMap Map<String, String> params);
//
//    /**
//     * 礼品街-收到的礼物列表
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("shopGivingInterfaces/v1.0/getOrdersGiftReceive")
//    Observable<HttpResult<List<GiftOrderBean>>> getReceivedGiftData(@FieldMap Map<String, String> params);
//
//    /**
//     * 仓库收礼
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:zhangmu")
//    @FormUrlEncoded
//    @POST("sheepMemberInterfaces/v1.0/memberAcceptGift")
//    Observable<HttpResult<String>> warehouseReceiveGift(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取众筹栏目专区
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @GET("chipsInterfaces/v1.0/getChipsClass")
//    Observable<HttpResult<RaiseColumnBean>> getRaiseColumnData();
//
//    /**
//     * 获取众筹个人认证详情
//     *
//     * @return
//     */
//    @Headers("name:member")
//    @FormUrlEncoded
//    @POST("memberInterfaces/v1.0/getMemberEnterpriseCertification")
//    Observable<HttpResult<RZDetail>> getMemberEnterpriseCertification(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 获取相应栏目的众筹列表数据
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/getChips")
//    Observable<HttpResult<List<Raises>>> getRaiseListData(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取众筹项目详情数据
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/getChipsDetail")
//    Observable<HttpResult<RaiseDetailBean>> getRaiseDetailData(@FieldMap Map<String, String> params);
//
//    /**
//     * 众筹---修改众筹（草稿箱发布）
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/updateChips")
//    Observable<HttpResult<String>> updateChips(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 获取众筹项目详情数据
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/getChipsComments")
//    Observable<HttpResult<List<RaiseCommentBean>>> getRaiseCommentData(@FieldMap Map<String, String> params);
//
//    /**
//     * 众筹评论点赞
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/insertChipsCommentsZan")
//    Observable<HttpResult<String>> raiseCommentPraise(@FieldMap Map<String, String> params);
//
//    /**
//     * 发布众筹(加入草稿)
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/insertChips")
//    Observable<HttpResult<String>> PushDomeRaise(@FieldMap Map<String, String> params);
//
//    /**
//     * 众筹分区列表
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/getChipsClass")
//    //Observable<HttpResult<List<ChipsClass>>> RaiseType(@FieldMap Map<String, String> params);
//    Observable<HttpResult<ChipsClass>> RaiseType(@FieldMap Map<String, String> params);
//
//    /**
//     * 众筹获得运费列表
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/getFreight")
//    Observable<HttpResult<List<FreightBean>>> getFreight(@FieldMap Map<String, String> params);
//
//    /**
//     * 设置默认运费模版
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/updateDefaultFreight")
//    Observable<HttpResult<String>> updateDefaultFreight(@FieldMap Map<String, String> params);
//
//    /**
//     * 删除运费模版
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/deleteFreight")
//    Observable<HttpResult<String>> deleteFreight(@FieldMap Map<String, String> params);
//
//    /**
//     * 众筹添加运费模版
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/insertFreight")
//    Observable<HttpResult<String>> insertFreight(@FieldMap Map<String, String> params);
//
//    /**
//     * 众筹草稿列表
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/getMyChips")
//    Observable<HttpResult<List<Raises>>> getMyChips(@FieldMap Map<String, String> params);
//
//    /**
//     * 众筹上线
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/pubishChips")
//    Observable<HttpResult<String>> pubishChips(@FieldMap Map<String, String> params);
//
//    /**
//     * 发布众筹公告
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/insertNotice")
//    Observable<HttpResult<String>> insertNotice(@FieldMap Map<String, String> params);
//
//    /**
//     * 添加收款账号
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/updateChipsBankCard")
//    Observable<HttpResult<String>> updateChipsBankCard(@FieldMap Map<String, String> params);
//
//    /**
//     * 限时购商品列表
//     *
//     * @param
//     * @return
//     */
//    @Headers("name:shop")
////    @FormUrlEncoded
////    @POST("shopActivityInterfaces/v1.0/getActivityLimitTimePurchase")
////    Observable<HttpResult<List<TimeBuyBean>>> getActivityLimitTimePurchase(@FieldMap Map<String, String> params);
//    //@FormUrlEncoded
//    @GET("shopActivityInterfaces/v1.0/getActivityLimitTimePurchase")
//    Observable<HttpResult<List<TimeBuyBean>>> getActivityLimitTimePurchase(/*@FieldMap Map<String, String> params*/);
//
//    /**
//     * 我的众筹
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/getChipsMember")
//    Observable<HttpResult<ChipsMember>> getChipsMember(@FieldMap Map<String, String> params);
//
//    /**
//     * 众筹草稿列表
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/delChips")
//    Observable<HttpResult<String>> delChips(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取默认搜索关键字
//     *
//     * @param default_type 1:集市默认关键字 2:农耕默认关键字 3:认养默认关键字。4:资讯默认关键字 5:圈子默认关键字
//     * @return
//
//     @Headers("name:zhangmu")
//     @FormUrlEncoded
//     @POST("sheepInterfaces/v1.0/getDefaultSearchs") Observable<HttpResult<List<SearchKeywordsBean>>> getSearchKeywords(@Field("default_type") String default_type);*/
//
//    /**
//     * 众筹省市列表
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:member")
//    @FormUrlEncoded
//    @POST("addressInterfaces/v1.0/getCitys")
//    Observable<HttpResult<List<CityBean>>> getCitys(@FieldMap Map<String, String> params);
//
//    /**
//     * 众筹运费详情
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/getFreightDetail")
//    Observable<HttpResult<FreightDetail>> getFreightDetail(@FieldMap Map<String, String> params);
//
//    /**
//     * 众筹运费详情
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/updateFreight")
//    Observable<HttpResult<String>> updateFreight(@FieldMap Map<String, String> params);
//
//    /**
//     * 请求众筹【回报商品】规格详情接口（请求规格详情数据）
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/getChipsReturnDetail")
//    Observable<HttpResult<RaiseDetailBean.ChipsReturnBeans>> raiseReturnDetailData(@Field("chips_return_id") int chips_return_id);
//
//    /**
//     * 众筹下单
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/insertOrder")
//    Observable<HttpResult<RaisePlaceOrderResult>> raisePlaceOrder(@FieldMap Map<String, String> params);
//
//    /**
//     * 众筹下单查询地址是否在配送范围
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/isFreightAdress")
//    Observable<HttpResult<String>> isDeliveryArea(@Field("freight_id") String freight_id, @Field("address_id") String address_id);
//
//    /**
//     * 获取众筹订单列表
//     * order_type	7:众筹已支持 8:打赏
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("orderInterfaces/v1.0/getOrdersV3")
//    Observable<HttpResult<List<RaiseOrderBean>>> getRaiseOrderList(@FieldMap Map<String, String> params);
//
//    /**
//     * 获取众筹收入数据
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/getChipsIncome")
//    Observable<HttpResult<RaiseIncomeBean>> getChipsIncome(@FieldMap Map<String, String> params);
//
//    /**
//     * 众筹-获赞列表
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/getChipsCommentsZan")
//    Observable<HttpResult<List<RaisePraiseBean>>> getChipsCommentsZan(@FieldMap Map<String, String> params);
//
//    /**
//     * 众筹收入-交易中、待结算订单数据
//     * pay_state	0:交易中 1:待结算
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("chipsInterfaces/v1.0/getChipsIncomeOrder")
//    Observable<HttpResult<List<RaiseUnfinishedOrderBean>>> getChipsIncomeOrder(@FieldMap Map<String, String> params);
//
//    /*----------------------------------------------卖家中心接口----------------------------------------------*/
//
//    /**
//     * 卖家中心主页
//     * order_type
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/getSellerMerchantsDetail")
//    Observable<HttpResult<SellerHomeBean>> getSellerMerchantsDetail(@FieldMap Map<String, String> params);
//
//    /**
//     * 客户列表
//     * order_type
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/getMerchantsMembersV2")
//    Observable<HttpResult<List<SellerMember>>> getMerchantsMembersV2(@FieldMap Map<String, String> params);
//
//    /**
//     * 粉丝列表
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/getMerchantsFanss")
//    Observable<HttpResult<List<SellerMember>>> getMerchantsFans(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 卖家客户主页
//     * order_type
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/getMerchantsMembers")
//    Observable<HttpResult<SellerHomeBean>> getMerchantsMembers(@FieldMap Map<String, String> params);
//
//    /**
//     * 订单管理
//     * order_type
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/getOrderMerchants")
//    Observable<HttpResult<List<RaiseOrder>>> getOrderMerchants(@FieldMap Map<String, String> params);
//
//    /**
//     * 订单管理
//     * order_type
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/getOrderLogisticsCompanys")
//    Observable<HttpResult<List<CourierCompanyBean>>> getOrderLogisticsCompanys(@FieldMap Map<String, String> params);
//
//    /**
//     * 订单管理
//     * order_type
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/getOrderMerchants")
//    Observable<HttpResult<List<RaiseOrder>>> getOrderMerchantsnum(@FieldMap Map<String, String> params);
//
//    /**
//     * 订单管理-订单详情
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/getOrderMerchantsDetail")
//    Observable<HttpResult<RaiseManagerOrderDetail>> getOrderMerchantsDetail(@FieldMap Map<String, String> params);
//
//    /**
//     * 订单管理-退款订单详情
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/getOrderRefundDetail")
//    Observable<HttpResult<RaiseManagerOrderDetail>> getRefundOrderDetail(@Field("refund_id") String refund_id);
//
//    /**
//     * 订单管理-订单详情
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/updateOrderMerchants")
//    Observable<HttpResult<String>> updateOrderMerchants(@FieldMap Map<String, String> params);
//
//    /**
//     *
//     * 订单管理-关闭集市订单
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/closeOrder")
//    Observable<HttpResult<String>> closeBazaarOrder(@Field("order_merchants_id") String order_merchants_id);
//    /**
//     *
//     *
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/updateOrderAddress")
//    Observable<HttpResult<String>> updateOrderAddress(@FieldMap Map<String, String> params);
//
//    /**
//     * 满减活动-类型列表
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("shopActivityInterfaces/v1.0/getActivityReduceClassBeans")
//    Observable<HttpResult<List<ReduceBean>>> getActivityReduceClassBeans(@FieldMap Map<String, String> params);
//
//    /**
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/getLogisticsName")
//    Observable<HttpResult<String>> getLogisticsName(@FieldMap Map<String, String> params);
//
//    /**
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("shopActivityInterfaces/v1.0/getReduceActivityGoods")
//    Observable<HttpResult<List<ReduceGoods>>> getReduceActivityGoods(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 卖家客户详情
//     * order_type
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/getMerchantsMemberDetail")
//    Observable<HttpResult<SellerCustomerDetail>> getMerchantsMemberDetail(@FieldMap Map<String, String> params);
//
//    /**
//     * 卖家客户动态
//     * order_type
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/getMemberDynamics")
//    Observable<HttpResult<List<CustomerDynamic>>> getMemberDynamics(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 添加集市商品
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/insertGoods")
//    Observable<HttpResult<String>> insertGoods(@FieldMap Map<String, String> params);
//
//    /**
//     * 修改集市商品
//     *
//     * @param params
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/updateGoods")
//    Observable<HttpResult<String>> updateGoods(@FieldMap Map<String, String> params);
//
//    /**
//     * 删除集市商品
//     *
//     * @param goods_id
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/deleteGoods")
//    Observable<HttpResult<String>> deleteGoods(@Field("goods_id") String goods_id);
//
//    /**
//     * 集市订单发货
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/sendOrder")
//    Observable<HttpResult<String>> bazaarOrderDeliverGoods(@FieldMap Map<String, String> params);
//
//    /**
//     * 集市订单修改物流信息
//     *
//     * @return
//     */
//    @Headers("name:shop")
//    @FormUrlEncoded
//    @POST("sellerGoodsInterfaces/v1.0/updateOrderLogistics")
//    Observable<HttpResult<String>> bazaarOrderUpdateLogistics(@FieldMap Map<String, String> params);
//
//
//    /**
//     * 获得黑名单列表数据
//     *
//     * @return
//     */
//    @Headers("name:circle")
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/getBlackMember")
//    Observable<HttpResult<List<BlacklistBean>>> getBlacklistData(@FieldMap Map<String, String> params);
//
//    /**
//     * 添加、解除黑名单
//     *
//     * @return
//     */
//    @Headers("name:circle")
//    @FormUrlEncoded
//    @POST("CircleInterfaces/v1.0/insertBlackMember")
//    Observable<HttpResult<String>> insertBlacklist(@FieldMap Map<String, String> params);
}
