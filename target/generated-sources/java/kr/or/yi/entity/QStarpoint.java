package kr.or.yi.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStarpoint is a Querydsl query type for Starpoint
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStarpoint extends EntityPathBase<Starpoint> {

    private static final long serialVersionUID = 840137997L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStarpoint starpoint = new QStarpoint("starpoint");

    public final QCafe cafeNo;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final DateTimePath<java.time.Instant> registrationDate = createDateTime("registrationDate", java.time.Instant.class);

    public final NumberPath<Integer> starPoint = createNumber("starPoint", Integer.class);

    public final StringPath starPointComment = createString("starPointComment");

    public final QTheme themeNo;

    public final DateTimePath<java.time.Instant> updateDate = createDateTime("updateDate", java.time.Instant.class);

    public final QUser userNo;

    public QStarpoint(String variable) {
        this(Starpoint.class, forVariable(variable), INITS);
    }

    public QStarpoint(Path<? extends Starpoint> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStarpoint(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStarpoint(PathMetadata metadata, PathInits inits) {
        this(Starpoint.class, metadata, inits);
    }

    public QStarpoint(Class<? extends Starpoint> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cafeNo = inits.isInitialized("cafeNo") ? new QCafe(forProperty("cafeNo")) : null;
        this.themeNo = inits.isInitialized("themeNo") ? new QTheme(forProperty("themeNo")) : null;
        this.userNo = inits.isInitialized("userNo") ? new QUser(forProperty("userNo")) : null;
    }

}

