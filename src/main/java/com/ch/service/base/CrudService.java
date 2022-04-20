package com.ch.service.base;

import com.ch.web.exception.NotFoundException;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.transaction.annotation.Transactional;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 *  CrudService interface  包含关于crud公用的方法
 * @param <D> Domain 领域模型
 * @param <E> element 代表这个元素的唯一主键
 */
public interface CrudService<D, E> {
    /**
     * List All
     *
     * @return List
     */
    @NonNull
    List<D> listAll();


    /**
     * List all by pageable
     *
     * @param pageable pageable
     * @return Page
     */
//    @NonNull
//    Page<D> listAll(@NonNull Pageable pageable);

    /**
     * List all by ids
     *
     * @param ids ids
     * @return List
     */
    @NonNull
    List<D> listAllByIds(@Nullable Collection<E> ids);

    /**
     * Fetch by id
     *
     * @param id id
     * @return Optional
     */
    @NonNull
    Optional<D> fetchById(@NonNull E id);

    /**
     * Get by id
     *
     * @param id id
     * @return D
     * @throws NotFoundException If the specified id does not exist
     */
    @NonNull
    D getById(@NonNull E id);

    /**
     * Gets D of nullable by id.
     *
     * @param id id
     * @return D
     */
    @Nullable
    D getByIdOfNullable(@NonNull E id);

    /**
     * Exists by id.
     *
     * @param id id
     * @return boolean
     */
    boolean existsById(@NonNull E id);

    /**
     * Must exist by id, or throw NotFoundException.
     *
     * @param id id
     * @throws NotFoundException If the specified id does not exist
     */
    void mustExistById(@NonNull E id);

    /**
     * count all
     *
     * @return long
     */
    long count();

    /**
     * save
     *
     * @param D D
     * @return D
     */
    @NonNull
    @Transactional
    D create(@NonNull D D);

    /**
     * save by Ds
     *
     * @param Ds Ds
     * @return List
     */
    @NonNull
    @Transactional
    List<D> createInBatch(@NonNull Collection<D> Ds);

    /**
     * Updates by D
     *
     * @param D D
     * @return D
     */
    @NonNull
    @Transactional
    D update(@NonNull D D);

    /**
     * Flushes all pending changes to the database.
     */
    void flush();

    /**
     * Updates by Ds
     *
     * @param Ds Ds
     * @return List
     */
    @NonNull
    @Transactional
    List<D> updateInBatch(@NonNull Collection<D> Ds);

    /**
     * Removes by id
     *
     * @param id id
     * @return D
     * @throws NotFoundException If the specified id does not exist
     */
    @NonNull
    @Transactional
    D removeById(@NonNull E id);

    /**
     * Removes by id if present.
     *
     * @param id id
     * @return D
     */
    @Nullable
    @Transactional
    D removeByIdOfNullable(@NonNull E id);

    /**
     * Remove by D
     *
     * @param D D
     */
    @Transactional
    void remove(@NonNull D D);

    /**
     * Remove by ids
     *
     * @param ids ids
     */
    @Transactional
    void removeInBatch(@NonNull Collection<E> ids);

    /**
     * Remove all by Ds
     *
     * @param Ds Ds
     */
    @Transactional
    void removeAll(@NonNull Collection<D> Ds);

    /**
     * Remove all
     */
    @Transactional
    void removeAll();
}
