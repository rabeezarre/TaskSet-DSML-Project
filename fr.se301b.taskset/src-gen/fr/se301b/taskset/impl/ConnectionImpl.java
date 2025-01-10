/**
 */
package fr.se301b.taskset.impl;

import fr.se301b.taskset.Connection;
import fr.se301b.taskset.Port;
import fr.se301b.taskset.TasksetPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.se301b.taskset.impl.ConnectionImpl#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link fr.se301b.taskset.impl.ConnectionImpl#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link fr.se301b.taskset.impl.ConnectionImpl#getDestPort <em>Dest Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends NamedElementImpl implements Connection {
	/**
	 * The default value of the '{@link #getQueueSize() <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSize()
	 * @generated
	 * @ordered
	 */
	protected static final int QUEUE_SIZE_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getQueueSize() <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSize()
	 * @generated
	 * @ordered
	 */
	protected int queueSize = QUEUE_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourcePort() <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePort()
	 * @generated
	 * @ordered
	 */
	protected Port sourcePort;

	/**
	 * The cached value of the '{@link #getDestPort() <em>Dest Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestPort()
	 * @generated
	 * @ordered
	 */
	protected Port destPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasksetPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQueueSize() {
		return queueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueSize(int newQueueSize) {
		int oldQueueSize = queueSize;
		queueSize = newQueueSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.CONNECTION__QUEUE_SIZE, oldQueueSize,
					queueSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getSourcePort() {
		if (sourcePort != null && sourcePort.eIsProxy()) {
			InternalEObject oldSourcePort = (InternalEObject) sourcePort;
			sourcePort = (Port) eResolveProxy(oldSourcePort);
			if (sourcePort != oldSourcePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasksetPackage.CONNECTION__SOURCE_PORT,
							oldSourcePort, sourcePort));
			}
		}
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetSourcePort() {
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourcePort(Port newSourcePort) {
		Port oldSourcePort = sourcePort;
		sourcePort = newSourcePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.CONNECTION__SOURCE_PORT, oldSourcePort,
					sourcePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getDestPort() {
		if (destPort != null && destPort.eIsProxy()) {
			InternalEObject oldDestPort = (InternalEObject) destPort;
			destPort = (Port) eResolveProxy(oldDestPort);
			if (destPort != oldDestPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasksetPackage.CONNECTION__DEST_PORT,
							oldDestPort, destPort));
			}
		}
		return destPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetDestPort() {
		return destPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestPort(Port newDestPort) {
		Port oldDestPort = destPort;
		destPort = newDestPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.CONNECTION__DEST_PORT, oldDestPort,
					destPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TasksetPackage.CONNECTION__QUEUE_SIZE:
			return getQueueSize();
		case TasksetPackage.CONNECTION__SOURCE_PORT:
			if (resolve)
				return getSourcePort();
			return basicGetSourcePort();
		case TasksetPackage.CONNECTION__DEST_PORT:
			if (resolve)
				return getDestPort();
			return basicGetDestPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TasksetPackage.CONNECTION__QUEUE_SIZE:
			setQueueSize((Integer) newValue);
			return;
		case TasksetPackage.CONNECTION__SOURCE_PORT:
			setSourcePort((Port) newValue);
			return;
		case TasksetPackage.CONNECTION__DEST_PORT:
			setDestPort((Port) newValue);
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
		case TasksetPackage.CONNECTION__QUEUE_SIZE:
			setQueueSize(QUEUE_SIZE_EDEFAULT);
			return;
		case TasksetPackage.CONNECTION__SOURCE_PORT:
			setSourcePort((Port) null);
			return;
		case TasksetPackage.CONNECTION__DEST_PORT:
			setDestPort((Port) null);
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
		case TasksetPackage.CONNECTION__QUEUE_SIZE:
			return queueSize != QUEUE_SIZE_EDEFAULT;
		case TasksetPackage.CONNECTION__SOURCE_PORT:
			return sourcePort != null;
		case TasksetPackage.CONNECTION__DEST_PORT:
			return destPort != null;
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
		result.append(" (queueSize: ");
		result.append(queueSize);
		result.append(')');
		return result.toString();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String getQualifiedName() {
		if (getSourcePort() != null && getDestPort() != null) {
			return getName() + ":" + getSourcePort().getQualifiedName() + "->" + getDestPort().getQualifiedName();
		}
		return getName();
	}

} //ConnectionImpl
