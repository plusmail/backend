package kr.or.yi.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPowerlink is a Querydsl query type for Powerlink
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPowerlink extends EntityPathBase<Powerlink> {

    private static final long serialVersionUID = -476759794L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPowerlink powerlink = new QPowerlink("powerlink");

    public final QCafe cafeNo;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final DateTimePath<java.time.Instant> postDate = createDateTime("postDate", java.time.Instant.class);

    public final NumberPath<Integer> powCdt = createNumber("powCdt", Integer.class);

    public final DateTimePath<java.time.Instant> regDate = createDateTime("regDate", java.time.Instant.class);

    public QPowerlink(String variable) {
        this(Powerlink.class, forVariable(variable), INITS);
    }

    public QPowerlink(Path<? extends Powerlink> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPowerlink(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPowerlink(PathMetadata metadata, PathInits inits) {
        this(Powerlink.class, metadata, inits);
    }

    public QPowerlink(Class<? extends Powerlink> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cafeNo = inits.isInitialized("cafeNo") ? new QCafe(forProperty("cafeNo")) : null;
    }

}

