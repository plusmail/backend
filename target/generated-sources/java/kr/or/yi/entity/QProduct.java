package kr.or.yi.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProduct is a Querydsl query type for Product
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProduct extends EntityPathBase<Product> {

    private static final long serialVersionUID = 931606334L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProduct product = new QProduct("product");

    public final SetPath<Buycoupon, QBuycoupon> buycoupons = this.<Buycoupon, QBuycoupon>createSet("buycoupons", Buycoupon.class, QBuycoupon.class, PathInits.DIRECT2);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> orderCount = createNumber("orderCount", Integer.class);

    public final StringPath productContent = createString("productContent");

    public final StringPath productImage = createString("productImage");

    public final StringPath productName = createString("productName");

    public final NumberPath<Integer> productPrice = createNumber("productPrice", Integer.class);

    public final QCategory productSort;

    public final QSupplier supplier;

    public final DateTimePath<java.time.Instant> valid = createDateTime("valid", java.time.Instant.class);

    public QProduct(String variable) {
        this(Product.class, forVariable(variable), INITS);
    }

    public QProduct(Path<? extends Product> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProduct(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProduct(PathMetadata metadata, PathInits inits) {
        this(Product.class, metadata, inits);
    }

    public QProduct(Class<? extends Product> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productSort = inits.isInitialized("productSort") ? new QCategory(forProperty("productSort")) : null;
        this.supplier = inits.isInitialized("supplier") ? new QSupplier(forProperty("supplier")) : null;
    }

}

