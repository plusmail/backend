package kr.or.yi.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCafe is a Querydsl query type for Cafe
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCafe extends EntityPathBase<Cafe> {

    private static final long serialVersionUID = -1948397138L;

    public static final QCafe cafe = new QCafe("cafe");

    public final StringPath address = createString("address");

    public final NumberPath<Integer> beerCdt = createNumber("beerCdt", Integer.class);

    public final NumberPath<Integer> bookCdt = createNumber("bookCdt", Integer.class);

    public final NumberPath<Integer> cafeCdt = createNumber("cafeCdt", Integer.class);

    public final StringPath cafeName = createString("cafeName");

    public final StringPath closedDay = createString("closedDay");

    public final StringPath content = createString("content");

    public final StringPath detailAddress = createString("detailAddress");

    public final NumberPath<Integer> goodsCdt = createNumber("goodsCdt", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> mkdessertCdt = createNumber("mkdessertCdt", Integer.class);

    public final NumberPath<Integer> nokidsCdt = createNumber("nokidsCdt", Integer.class);

    public final StringPath oneline = createString("oneline");

    public final StringPath ownerLicenseNo = createString("ownerLicenseNo");

    public final NumberPath<Integer> parkingCdt = createNumber("parkingCdt", Integer.class);

    public final NumberPath<Integer> powerlinkCdt = createNumber("powerlinkCdt", Integer.class);

    public final NumberPath<Integer> puppyCdt = createNumber("puppyCdt", Integer.class);

    public final DateTimePath<java.time.Instant> registrationDate = createDateTime("registrationDate", java.time.Instant.class);

    public final NumberPath<Integer> reservationCdt = createNumber("reservationCdt", Integer.class);

    public final NumberPath<Integer> reserveokCdt = createNumber("reserveokCdt", Integer.class);

    public final StringPath sns = createString("sns");

    public final NumberPath<Integer> socketNumber = createNumber("socketNumber", Integer.class);

    public final NumberPath<Integer> tableNumber = createNumber("tableNumber", Integer.class);

    public final StringPath tel = createString("tel");

    public final NumberPath<Integer> terrasCdt = createNumber("terrasCdt", Integer.class);

    public final NumberPath<Integer> toiletCdt = createNumber("toiletCdt", Integer.class);

    public final DateTimePath<java.time.Instant> updateDate = createDateTime("updateDate", java.time.Instant.class);

    public final NumberPath<Integer> viewNumber = createNumber("viewNumber", Integer.class);

    public final NumberPath<Integer> voteNumber = createNumber("voteNumber", Integer.class);

    public final NumberPath<Integer> wifiCdt = createNumber("wifiCdt", Integer.class);

    public final StringPath wkdOpentime = createString("wkdOpentime");

    public final StringPath wkndOpentime = createString("wkndOpentime");

    public final NumberPath<Integer> wondooBuyCdt = createNumber("wondooBuyCdt", Integer.class);

    public QCafe(String variable) {
        super(Cafe.class, forVariable(variable));
    }

    public QCafe(Path<? extends Cafe> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCafe(PathMetadata metadata) {
        super(Cafe.class, metadata);
    }

}

