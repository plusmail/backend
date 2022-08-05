package kr.or.yi.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBuycoupon is a Querydsl query type for Buycoupon
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBuycoupon extends EntityPathBase<Buycoupon> {

    private static final long serialVersionUID = -1654987589L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBuycoupon buycoupon = new QBuycoupon("buycoupon");

    public final DateTimePath<java.time.Instant> buyDate = createDateTime("buyDate", java.time.Instant.class);

    public final QProduct buyProduct;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> useCdt = createNumber("useCdt", Integer.class);

    public final QUser userNo;

    public final DateTimePath<java.time.Instant> validity = createDateTime("validity", java.time.Instant.class);

    public QBuycoupon(String variable) {
        this(Buycoupon.class, forVariable(variable), INITS);
    }

    public QBuycoupon(Path<? extends Buycoupon> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBuycoupon(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBuycoupon(PathMetadata metadata, PathInits inits) {
        this(Buycoupon.class, metadata, inits);
    }

    public QBuycoupon(Class<? extends Buycoupon> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.buyProduct = inits.isInitialized("buyProduct") ? new QProduct(forProperty("buyProduct"), inits.get("buyProduct")) : null;
        this.userNo = inits.isInitialized("userNo") ? new QUser(forProperty("userNo")) : null;
    }

}

