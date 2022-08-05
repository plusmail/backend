package kr.or.yi.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMenukind is a Querydsl query type for Menukind
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMenukind extends EntityPathBase<Menukind> {

    private static final long serialVersionUID = -784305916L;

    public static final QMenukind menukind = new QMenukind("menukind");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath sortName = createString("sortName");

    public QMenukind(String variable) {
        super(Menukind.class, forVariable(variable));
    }

    public QMenukind(Path<? extends Menukind> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMenukind(PathMetadata metadata) {
        super(Menukind.class, metadata);
    }

}

