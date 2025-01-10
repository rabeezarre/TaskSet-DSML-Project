/**
 */
package fr.se301b.taskset.impl;

import fr.se301b.taskset.DispatchKind;
import fr.se301b.taskset.Port;
import fr.se301b.taskset.Task;
import fr.se301b.taskset.TasksetPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.se301b.taskset.impl.TaskImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.se301b.taskset.impl.TaskImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.se301b.taskset.impl.TaskImpl#getMinDelay <em>Min Delay</em>}</li>
 *   <li>{@link fr.se301b.taskset.impl.TaskImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends NamedElementImpl implements Task {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DispatchKind KIND_EDEFAULT = DispatchKind.PERIODIC;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected DispatchKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected int period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinDelay() <em>Min Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDelay()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_DELAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinDelay() <em>Min Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDelay()
	 * @generated
	 * @ordered
	 */
	protected int minDelay = MIN_DELAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasksetPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DispatchKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(DispatchKind newKind) {
		DispatchKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.TASK__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriod(int newPeriod) {
		int oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.TASK__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinDelay() {
		return minDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinDelay(int newMinDelay) {
		int oldMinDelay = minDelay;
		minDelay = newMinDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.TASK__MIN_DELAY, oldMinDelay,
					minDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, TasksetPackage.TASK__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TasksetPackage.TASK__PORTS:
			return ((InternalEList<?>) getPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TasksetPackage.TASK__KIND:
			return getKind();
		case TasksetPackage.TASK__PERIOD:
			return getPeriod();
		case TasksetPackage.TASK__MIN_DELAY:
			return getMinDelay();
		case TasksetPackage.TASK__PORTS:
			return getPorts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TasksetPackage.TASK__KIND:
			setKind((DispatchKind) newValue);
			return;
		case TasksetPackage.TASK__PERIOD:
			setPeriod((Integer) newValue);
			return;
		case TasksetPackage.TASK__MIN_DELAY:
			setMinDelay((Integer) newValue);
			return;
		case TasksetPackage.TASK__PORTS:
			getPorts().clear();
			getPorts().addAll((Collection<? extends Port>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TasksetPackage.TASK__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case TasksetPackage.TASK__PERIOD:
			setPeriod(PERIOD_EDEFAULT);
			return;
		case TasksetPackage.TASK__MIN_DELAY:
			setMinDelay(MIN_DELAY_EDEFAULT);
			return;
		case TasksetPackage.TASK__PORTS:
			getPorts().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TasksetPackage.TASK__KIND:
			return kind != KIND_EDEFAULT;
		case TasksetPackage.TASK__PERIOD:
			return period != PERIOD_EDEFAULT;
		case TasksetPackage.TASK__MIN_DELAY:
			return minDelay != MIN_DELAY_EDEFAULT;
		case TasksetPackage.TASK__PORTS:
			return ports != null && !ports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(", period: ");
		result.append(period);
		result.append(", minDelay: ");
		result.append(minDelay);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
