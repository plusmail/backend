package kr.or.yi.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMenu is a Querydsl query type for Menu
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMenu extends EntityPathBase<Menu> {

    private static final long serialVersionUID = -1948095120L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMenu menu = new QMenu("menu");

    public final QCafe cafeNo;

    public final NumberPath<Integer> hI = createNumber("hI", Integer.class);

    public final NumberPath<Integer> icedMenuPrice = createNumber("icedMenuPrice", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QMenukind menukinds;

    public final StringPath menuName = createString("menuName");

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public QMenu(String variable) {
        this(Menu.class, forVariable(variable), INITS);
    }

    public QMenu(Path<? extends Menu> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMenu(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMenu(PathMetadata metadata, PathInits inits) {
        this(Menu.class, metadata, inits);
    }

    public QMenu(Class<? extends Menu> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cafeNo = inits.isInitialized("cafeNo") ? new QCafe(forProperty("cafeNo")) : null;
        this.menukinds = inits.isInitialized("menukinds") ? new QMenukind(forProperty("menukinds")) : null;
    }

}

