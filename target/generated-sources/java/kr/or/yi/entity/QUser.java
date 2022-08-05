package kr.or.yi.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -1947843620L;

    public static final QUser user = new QUser("user");

    public final StringPath address = createString("address");

    public final DateTimePath<java.time.Instant> birthday = createDateTime("birthday", java.time.Instant.class);

    public final StringPath detailAddress = createString("detailAddress");

    public final StringPath email = createString("email");

    public final NumberPath<Integer> gender = createNumber("gender", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final StringPath nick = createString("nick");

    public final StringPath password = createString("password");

    public final NumberPath<Integer> point = createNumber("point", Integer.class);

    public final StringPath tel = createString("tel");

    public final StringPath userId = createString("userId");

    public final DateTimePath<java.time.Instant> userJoinDate = createDateTime("userJoinDate", java.time.Instant.class);

    public final NumberPath<Integer> userLeaveCondition = createNumber("userLeaveCondition", Integer.class);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

