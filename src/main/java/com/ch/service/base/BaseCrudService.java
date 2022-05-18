package com.ch.service.base;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ch.web.exception.NotFoundException;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.transaction.annotation.Transactional;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 *  CrudService interface  包含关于crud公用的方法
 * @param <Domain> Domain 领域模型
 * @param <E> element 代表这个元素的唯一主键
 */
public interface BaseCrudService<Domain, E>  {
    /**
     * List All
     * @return List
     */
    @NonNull
    List<Domain> listAll();


    /**
     * List all by pageable
     *
     * @param pageable pageable
     * @return Page
     */


    /**
     * List all by ids
     *
     * @param ids ids
     * @return List
     */
    @NonNull
    List<Domain> listAllByIds(@Nullable Collection<E> ids);

    /**
     * Fetch by id
     *
     * @param id id
     * @return Optional
     */
    @NonNull
    Optional<Domain> fetchById(@NonNull E id);

    /**
     * Get by id
     *
     * @param id id
     * @return Domain
     * @throws NotFoundException If the specified id does not exist
     */
    @NonNull
    Domain getById(@NonNull E id);

    /**
     * Gets Domain of nullable by id.
     *
     * @param id id
     * @return Domain
     */
    @Nullable
    Domain getByIdOfNullable(@NonNull E id);

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
     * @param Domain Domain
     * @return Domain
     */
    @NonNull
    @Transactional
    Domain create(@NonNull Domain Domain);

    /**
     * save by Domains
     *
     * @param Domains Domains
     * @return List
     */
    @NonNull
    @Transactional
    List<Domain> createInBatch(@NonNull Collection<Domain> Domains);

    /**
     * Updates by Domain
     *
     * @param Domain Domain
     * @return Domain
     */
    @NonNull
    @Transactional
    Domain update(@NonNull Domain Domain);

    /**
     * Updates by Domains
     *
     * @param Domains Domains
     * @return List
     */
    @NonNull
    @Transactional
    List<Domain> updateInBatch(@NonNull Collection<Domain> Domains);

    /**
     * Removes by id
     *
     * @param id id
     * @return Domain
     * @throws NotFoundException If the specified id does not exist
     */
    @NonNull
    @Transactional
    Domain removeById(@NonNull E id);

    /**
     * Removes by id if present.
     *
     * @param id id
     * @return Domain
     */
    @Nullable
    @Transactional
    Domain removeByIdOfNullable(@NonNull E id);

    /**
     * Remove by Domain
     *
     * @param Domain Domain
     */
    @Transactional
    void remove(@NonNull Domain Domain);

    /**
     * Remove by ids
     *
     * @param ids ids
     */
    @Transactional
    void removeInBatch(@NonNull Collection<E> ids);

    /**
     * Remove all by Domains
     *
     * @param Domain Domains
     */
    @Transactional
    void removeAll(@NonNull Collection<Domain> Domain);

    /**
     * Remove all
     */
    @Transactional
    void removeAll();
}