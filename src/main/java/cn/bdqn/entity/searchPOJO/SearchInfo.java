package cn.bdqn.entity.searchPOJO;

/**
 * Created by Shinelon on 2018/3/20.
 */
public class SearchInfo {
    private int commodityId;
    private int labelId;

    public int getDiscussCount ( ) {
        return discussCount;
    }

    public void setDiscussCount ( int discussCount ) {
        this.discussCount = discussCount;
    }

    private int discussCount;

    public int getLabelId ( ) {
        return labelId;
    }

    public void setLabelId ( int labelId ) {
        this.labelId = labelId;
    }

    private   String  pictureShow,priceShow,Search,commodityName;

    @Override
    public String toString ( ) {
        return "SearchInfoDao{" +
                "commodityId=" + commodityId +
//                ", commodityPictureId=" + commodityPictureId +
                ", pictureShow='" + pictureShow + '\'' +
                ", priceShow='" + priceShow + '\'' +
                ", Search='" + Search + '\'' +
                ", commodityName='" + commodityName + '\'' +
                '}';
    }

    public int getCommodityId ( ) {
        return commodityId;
    }

    public void setCommodityId ( int commodityId ) {
        this.commodityId = commodityId;
    }

//    public int getCommodityPictureId ( ) {
//        return commodityPictureId;
//    }
//
//    public void setCommodityPictureId ( int commodityPictureId ) {
//        this.commodityPictureId = commodityPictureId;
//    }

    public String getPictureShow ( ) {
        return pictureShow;
    }

    public void setPictureShow ( String pictureShow ) {
        this.pictureShow = pictureShow;
    }

    public String getPriceShow ( ) {
        return priceShow;
    }

    public void setPriceShow ( String priceShow ) {
        this.priceShow = priceShow;
    }

    public String getSearch ( ) {
        return Search;
    }

    public void setSearch ( String search ) {
        Search = search;
    }

    public String getCommodityName ( ) {
        return commodityName;
    }

    public void setCommodityName ( String commodityName ) {
        this.commodityName = commodityName;
    }
}
