package kr.or.yi.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoard is a Querydsl query type for Board
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoard extends EntityPathBase<Board> {

    private static final long serialVersionUID = -271279883L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoard board = new QBoard("templates/board");

    public final StringPath address = createString("address");

    public final NumberPath<Integer> boardDelCdt = createNumber("boardDelCdt", Integer.class);

    public final QBoardkind boardNo2;

    public final QCafe cafeNo;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final SetPath<Image, QImage> images = this.<Image, QImage>createSet("images", Image.class, QImage.class, PathInits.DIRECT2);

    public final QKeywordcate keySortNo;

    public final DateTimePath<java.time.Instant> registrationDate = createDateTime("registrationDate", java.time.Instant.class);

    public final SetPath<Reply, QReply> replies = this.<Reply, QReply>createSet("replies", Reply.class, QReply.class, PathInits.DIRECT2);

    public final NumberPath<Integer> replyCnt = createNumber("replyCnt", Integer.class);

    public final QTheme themeNo;

    public final DateTimePath<java.time.Instant> updateDate = createDateTime("updateDate", java.time.Instant.class);

    public final QUser userNo;

    public final NumberPath<Integer> viewNumber = createNumber("viewNumber", Integer.class);

    public final NumberPath<Integer> voteNumber = createNumber("voteNumber", Integer.class);

    public final SetPath<Vote, QVote> votes = this.<Vote, QVote>createSet("votes", Vote.class, QVote.class, PathInits.DIRECT2);

    public final StringPath writingContent = createString("writingContent");

    public final NumberPath<Integer> writingLockCondition = createNumber("writingLockCondition", Integer.class);

    public final StringPath writingTitle = createString("writingTitle");

    public final QZone zoneNo;

    public QBoard(String variable) {
        this(Board.class, forVariable(variable), INITS);
    }

    public QBoard(Path<? extends Board> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoard(PathMetadata metadata, PathInits inits) {
        this(Board.class, metadata, inits);
    }

    public QBoard(Class<? extends Board> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.boardNo2 = inits.isInitialized("boardNo2") ? new QBoardkind(forProperty("boardNo2")) : null;
        this.cafeNo = inits.isInitialized("cafeNo") ? new QCafe(forProperty("cafeNo")) : null;
        this.keySortNo = inits.isInitialized("keySortNo") ? new QKeywordcate(forProperty("keySortNo")) : null;
        this.themeNo = inits.isInitialized("themeNo") ? new QTheme(forProperty("themeNo")) : null;
        this.userNo = inits.isInitialized("userNo") ? new QUser(forProperty("userNo")) : null;
        this.zoneNo = inits.isInitialized("zoneNo") ? new QZone(forProperty("zoneNo")) : null;
    }

}

