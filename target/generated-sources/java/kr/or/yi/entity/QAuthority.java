package kr.or.yi.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAuthority is a Querydsl query type for Authority
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAuthority extends EntityPathBase<Authority> {

    private static final long serialVersionUID = 152965586L;

    public static final QAuthority authority = new QAuthority("authority");

    public final SetPath<Admin, QAdmin> admins = this.<Admin, QAdmin>createSet("admins", Admin.class, QAdmin.class, PathInits.DIRECT2);

    public final StringPath anoAuthorityName = createString("anoAuthorityName");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public QAuthority(String variable) {
        super(Authority.class, forVariable(variable));
    }

    public QAuthority(Path<? extends Authority> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuthority(PathMetadata metadata) {
        super(Authority.class, metadata);
    }

}

