package kr.or.yi.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QKeywordcate is a Querydsl query type for Keywordcate
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QKeywordcate extends EntityPathBase<Keywordcate> {

    private static final long serialVersionUID = -1049485433L;

    public static final QKeywordcate keywordcate = new QKeywordcate("keywordcate");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath keyName = createString("keyName");

    public QKeywordcate(String variable) {
        super(Keywordcate.class, forVariable(variable));
    }

    public QKeywordcate(Path<? extends Keywordcate> path) {
        super(path.getType(), path.getMetadata());
    }

    public QKeywordcate(PathMetadata metadata) {
        super(Keywordcate.class, metadata);
    }

}

