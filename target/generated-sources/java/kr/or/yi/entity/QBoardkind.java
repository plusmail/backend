package kr.or.yi.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBoardkind is a Querydsl query type for Boardkind
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardkind extends EntityPathBase<Boardkind> {

    private static final long serialVersionUID = 1366774281L;

    public static final QBoardkind boardkind = new QBoardkind("boardkind");

    public final StringPath boardName = createString("boardName");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public QBoardkind(String variable) {
        super(Boardkind.class, forVariable(variable));
    }

    public QBoardkind(Path<? extends Boardkind> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoardkind(PathMetadata metadata) {
        super(Boardkind.class, metadata);
    }

}

